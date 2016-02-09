/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

import static com.home.collections.Designation.ARCHITECT;
import static com.home.collections.Designation.DEVELEOPER;
import static com.home.collections.Designation.MANAGER;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestEmployee
{
    public static void main(String[] args)
    {
        // List<Employee> list = new ArrayList<Employee>();
        Queue<Employee> list = new PriorityQueue<>();
        list.add(new Employee("Ravinder", DEVELEOPER));
        list.add(new Employee("Kadiyan", ARCHITECT));
        list.add(new Employee("Sewah", MANAGER));
        list.add(new Employee("Ravinder1", DEVELEOPER));
        list.add(new Employee("Kadiyan1", ARCHITECT));
        list.add(new Employee("Sewah1", MANAGER));
        // Collections.sort(list);
        // for (Employee employee : list)
        // {
        // System.out.println(employee);
        // }
        while (!list.isEmpty())
            System.out.println(list.poll());
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
