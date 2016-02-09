/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample
{
    
    public static void main(String[] args)
    {
        CyclicBarrier barrier = new CyclicBarrier(2);
        Thread producer = new Producer(barrier);
        Thread consumer = new Consumer(barrier);
        producer.start();
        consumer.start();
        
    }
    
    private static class Producer extends Thread
    {
        private CyclicBarrier barrier;
        
        public Producer(CyclicBarrier barrier)
        {
            this.barrier = barrier;
        }
        
        @Override
        public void run()
        {
            System.out.println("Producer");
            
        }
        
    }
    
    private static class Consumer extends Thread
    {
        private CyclicBarrier barrier;
        
        public Consumer(CyclicBarrier barrier)
        {
            this.barrier = barrier;
        }
        
        @Override
        public void run()
        {
            System.out.println("Consumer");
            
        }
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
