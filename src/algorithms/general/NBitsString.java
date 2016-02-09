/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.general;

import algorithms.sorting.Utility;

public class NBitsString
{
    public static void main(String[] args)
    {
        int[] a = new int[2];
        nBitString(a, 2);
        
    }
    
    private static void nBitString(int[] a, int n)
    {
        if (n < 1)
        {
            Utility.print(a);
        }
        else
        {
            a[n - 1] = 0;
            nBitString(a, n - 1);
            a[n - 1] = 1;
            nBitString(a, n - 1);
        }
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
