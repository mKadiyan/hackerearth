/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousBlockingQueueExample
{
    public static void main(String[] args)
    {
        final BlockingQueue<Integer> queue = new SynchronousQueue<>();
        
        Thread producer = new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                    try
                    {
                        queue.put(i);
                    }
                    catch (InterruptedException e)
                    {
                        // TODO Auto-generated catch block
                        
                    }
                
            }
        }, "producer");
        
        Thread consumer = new Thread(new Runnable()
        {
            
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                    try
                    {
                        System.out.println(queue.take());
                    }
                    catch (InterruptedException e)
                    {
                        // TODO Auto-generated catch block
                        
                    }
                
            }
        }, "consumer");
        
        producer.start();
        consumer.start();
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
