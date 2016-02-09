/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.general;

import algorithms.sorting.Utility;

public class SortedWithAbsValue
{
    public static void main(String[] args)
    {
        int arr[] = { -8, -5, -3, -2, 1, 2, 6, 9 };
        
        Utility.print(arr);
        sort(arr);
        Utility.print(arr);
    }
    
    private static void sort(int[] arr)
    {
        int temp;
        int firstPositive = getPositionNegativeEnd(arr);
        
        // for negative with abs
        for (int i = 0; i < firstPositive / 2; i++)
        {
            temp = arr[i];
            arr[i] = arr[firstPositive - i - 1];
            arr[firstPositive - i - 1] = temp;
        }
        
        int lastNegative = firstPositive - 1;
        int start = 0;
        int[] tarr = new int[arr.length];
        int index = 0;
        while (start <= lastNegative && firstPositive < arr.length)
        {
            if (Math.abs(arr[start]) < arr[firstPositive])
            {
                tarr[index++] = arr[start];
                start++;
            }
            else
            {
                tarr[index++] = arr[firstPositive];
                firstPositive++;
            }
        }
        while (start <= lastNegative)
        {
            tarr[index++] = arr[start];
            start++;
        }
        while (firstPositive < arr.length)
        {
            tarr[index++] = arr[firstPositive];
            firstPositive++;
        }
        for (int j = 0; j < tarr.length; j++)
            arr[j] = tarr[j];
    }
    
    private static int getPositionNegativeEnd(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 0)
                return i;
        }
        return -1;
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
