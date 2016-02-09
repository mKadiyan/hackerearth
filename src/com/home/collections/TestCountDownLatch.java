/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch
{
    public static void main(String[] args) throws InterruptedException
    {
        CountDownLatch latch = new CountDownLatch(3);
        
        Waiter waiter = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);
        
        new Thread(waiter).start();
        new Thread(decrementer).start();
        
        Thread.sleep(4000);
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
