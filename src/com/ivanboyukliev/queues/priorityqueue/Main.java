package com.ivanboyukliev.queues.priorityqueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(25);
        pQueue.add(-22);
        pQueue.add(1343);
        pQueue.add(54);
        pQueue.add(0);
        pQueue.add(-3492);
        pQueue.add(429);

//        System.out.println(pQueue.peek());
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.peek());
//
//        System.out.println(pQueue.poll());
//        System.out.println(pQueue.peek());
         Object[] ints = pQueue.toArray();
        for(Object num : ints){
            System.out.println(num);
        }
    }
}
