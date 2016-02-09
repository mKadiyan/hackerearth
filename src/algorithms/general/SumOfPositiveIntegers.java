/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.general;

public class SumOfPositiveIntegers
{
    static void intpart(String pref, int n, int maxi)
    {
        if (n == 0)
        {
            System.out.println(pref);
            return;
        }
        for (int i = 1; i <= maxi && i <= n; i++)
            intpart(pref + (pref == "" ? "" : "+") + i, n - i, i);
    }
    
    public static void main(String[] args)
    {
        int n = 5;
        intpart("", n, n);
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
