/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package com.home.cci.arraysandstrings;

public class Anagrams
{
    public static void main(String[] args)
    {
        char[] a = "ravinder".toCharArray();
        char[] b = "ravindre".toCharArray();
        int[] count = new int[256];
        if (a.length != b.length)
            System.out.println("No");
        else
        {
            for (int i = 0; i < a.length; i++)
                count[a[i]]++;
            for (int i = 0; i < b.length; i++)
            {
                if (--count[b[i]] < 0)
                {
                    System.out.println("No");
                    break;
                }
            }
        }
        
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
