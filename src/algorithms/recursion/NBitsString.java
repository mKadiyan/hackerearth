/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.recursion;

import java.util.Arrays;

public class NBitsString
{
    static int[] A = new int[5];
    
    public static void main(String[] args)
    {
        new NBitsString().solve(A.length);
    }
    
    void solve(int n)
    {
        if (n < 1)
            System.out.println(Arrays.toString(A));
        else
        {
            A[n - 1] = 0;
            solve(n - 1);
            A[n - 1] = 1;
            solve(n - 1);
        }
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
