/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package algorithms.dynamicprogramming;

import algorithms.sorting.Utility;


public class Bridge
{
    public static void main(String[] args)
    {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 3, 2, 4 };
        
        System.out.println(maxBridge(arr1, arr2));
    }
    
    private static int maxBridge(int[] arr1, int[] arr2)
    {
        int tab[][] = new int[arr1.length + 1][arr2.length + 1];
        for (int i = 1; i < tab.length; i++)
        {
            for (int j = 1; j < tab[i].length; j++)
            {
                if (arr1[i - 1] == arr2[j - 1])
                    tab[i][j] = Math.max(tab[i][j - 1], tab[i - 1][j]) + 1;
                else
                    tab[i][j] = Math.max(tab[i][j - 1], tab[i - 1][j]);
                Utility.print(tab);
            }
        }
        Utility.print(tab);
        return tab[arr1.length][arr2.length];
    }
}


/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 *
 * R8
 */
