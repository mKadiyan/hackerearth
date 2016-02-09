/*
 * Copyright (c) Mehar  2015 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.recursion;

public class RecurssionSortedArray
{
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4 };
        System.out.println(new RecurssionSortedArray().check(A, A.length));
    }
    
    int check(int[] A, int index)
    {
        if (index == 1)
            return 1;
        return A[index - 1] < A[index - 2] ? 0 : check(A, index - 1);
    }
}

/*
 * Copyright (c) Mehar 2015 ALL RIGHTS RESERVED
 */
