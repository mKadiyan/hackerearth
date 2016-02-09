/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.collections;

public enum Designation
{
    MANAGER(1),
    DEVELEOPER(2),
    ARCHITECT(3);
    private int value;
    
    private Designation(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
