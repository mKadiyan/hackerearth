/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.general;

import algorithms.sorting.Utility;

public class RotateMatrix
{
    public static void main(String[] args)
    {
        int[][] mat = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 8, 2, 4, 5 },
            { 3, 6, 7, 9 }
        };
        // int[][] mat = {
        // { 1, 2 },
        // { 3, 4 }
        // };
        Utility.print(mat);
        rotateBy90Degree(mat);
        Utility.print(mat);
        
    }
    
    private static void rotateBy90Degree(int[][] a)
    {
        int tmp;
        int n = a.length;
        for (int i = 0; i < n / 2; i++)
        {
            for (int j = i; j < n - i - 1; j++)
            {
                tmp = a[i][j];
                a[i][j] = a[j][n - i - 1];
                a[j][n - i - 1] = a[n - i - 1][n - j - 1];
                a[n - i - 1][n - j - 1] = a[n - j - 1][i];
                a[n - j - 1][i] = tmp;
                Utility.print(a);
            }
        }
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
