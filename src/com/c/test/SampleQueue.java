package com.c.test;


/**
 * implement queue
 * FIFO
 *
 * push , pop
 */

public class SampleQueue {

    //using array
    private static int dataQueue[];
    //pointers to first and last index and totalValue
    private static int first, last, totalValue;

    SampleQueue(int totalValue) {
        this.first = 0;
        this.last = 0;
        this.totalValue = totalValue;

    }
    private static void push(Integer data) {

        //fail first
        if (null == data) {
            System.out.println("Data cant be inserted in queue, please check data");
            return;
        }
        if (last == totalValue) {
            //check for queue is full
            System.out.println("Data cant be inserted in queue, queue is full");
            return;
        }

        //if queue is not created then create it first
        if(null == dataQueue || dataQueue.length <=0) {
            dataQueue = new int[totalValue];
        }

        dataQueue[last] = data;
        last++;
        return;
    }

    private static Integer pop() {
        Integer value = null;
        //empty queue
        if (null == dataQueue || first == last) {
            System.out.println("Queue is empty");
            return null;
        }
        value = dataQueue[first];
        first++;
        return value;
    }

}
