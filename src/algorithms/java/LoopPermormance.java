/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopPermormance
{
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++)
        {
            arrayList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0, n = arrayList.size(); i < n; i++)
        {
            Object element = arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
        start = System.currentTimeMillis();
        for (Object obj : arrayList)
        {
            
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        
        start = System.currentTimeMillis();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            Object element = iterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
