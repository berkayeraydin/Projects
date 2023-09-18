package org.training.java.advanced.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class QueueRun {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(1_000);
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1_000);
        PriorityQueue<String> strings = new PriorityQueue<>();
        DelayQueue<QueueEntry> strings1 = new DelayQueue<>();


        queue.add("osman");
        String poll = queue.poll();
        String peek = queue.peek();

        try {
            String take = blockingQueue.take();
            String poll1 = blockingQueue.poll(10,
                                              TimeUnit.MILLISECONDS);

        } catch (InterruptedException e) {
        }

        Deque<String> stringDeque = new ArrayDeque<>();

        stringDeque.addFirst("osman");
        stringDeque.addFirst("ali");
        stringDeque.addLast("mehmet");

    }
}
