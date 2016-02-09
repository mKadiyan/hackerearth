/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.general;

import algorithms.sorting.Utility;

public class StringPermutation
{
    static char[] A = new char[3];
    static String s = "AB";
    static int c = 0;
    
    public static void main(String[] args)
    {
        kString(A.length, s.length());
        
    }
    
    public static void kString(int n, int k)
    {
        if (n < 1)
        {
            // System.out.print(c++ + "==");
            Utility.print(A);
        }
        else
        {
            for (int i = 0; i < k; i++)
            {
                A[n - 1] = s.charAt(i);
                kString(n - 1, k);
            }
        }
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
