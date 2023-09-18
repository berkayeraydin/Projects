package org.training.design.patterns.creational.objectpooling;

public class Connection {
    private ConnectionPool connectionPool;

    public Connection(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public void doSomethiing(){

    }


    public void close(){
        connectionPool.giveBack(this);
    }
}
