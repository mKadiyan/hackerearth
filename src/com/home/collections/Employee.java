/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

public class Employee implements Comparable<Employee>
{
    private String name;
    private Designation designation;
    
    public Employee(String name, Designation designation)
    {
        this.name = name;
        this.designation = designation;
    }
    
    @Override
    public int compareTo(Employee o)
    {
        return designation.getValue() - o.designation.getValue();
    }
    
    @Override
    public String toString()
    {
        return "Employee [name=" + name + ", designation=" + designation + "]";
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
