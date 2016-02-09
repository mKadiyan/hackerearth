/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

import java.util.concurrent.Semaphore;

public class SemaphoreExample
{
    
    public static void main(String[] args)
    {
        MyQueue my = new MyQueue();
        Thread producer = new Producer(my);
        Thread consumer = new Consumer(my);
        producer.start();
        consumer.start();
        
    }
    
    private static class Producer extends Thread
    {
        
        private MyQueue my;
        
        public Producer(MyQueue my)
        {
            this.my = my;
        }
        
        @Override
        public void run()
        {
            for (int i = 0; i < 10; i++)
            {
                my.getNumber();
            }
            
        }
        
    }
    
    private static class Consumer extends Thread
    {
        
        private MyQueue my;
        
        public Consumer(MyQueue my)
        {
            this.my = my;
        }
        
        @Override
        public void run()
        {
            
            for (int i = 0; i < 10; i++)
            {
                my.put(i);
            }
            
        }
        
    }
    
    private static class MyQueue
    {
        int number;
        Semaphore prod = new Semaphore(1);
        Semaphore cons = new Semaphore(0);
        
        public void put(int number)
        {
            try
            {
                prod.acquire();
                this.number = number;
                System.out.println("Producer set = " + number);
                cons.release();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                
            }
            
        }
        
        public int getNumber()
        {
            int numb = -1;
            try
            {
                cons.acquire();
                numb = number;
                System.out.println("Consumer get = " + number);
                prod.release();
                
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                
            }
            return numb;
        }
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
