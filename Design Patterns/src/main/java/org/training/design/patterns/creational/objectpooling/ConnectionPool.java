package org.training.design.patterns.creational.objectpooling;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {

    private BlockingQueue<Connection> connectionQueue = new ArrayBlockingQueue<>(1_000);

    public ConnectionPool() {
        for (int i = 0; i < 20; i++) {
            // open connection
            Connection connection = new Connection(this);
            connectionQueue.add(connection);
        }
    }

    public Connection getConnection() throws InterruptedException {
        return connectionQueue.take();
    }


    public void giveBack(Connection connection) {
        connectionQueue.add(connection);
    }

}
