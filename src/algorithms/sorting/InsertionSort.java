/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
        // int[] arr = { 3, 5, 7, 1, 23, 56, 4, 2, 3, 5, 100 };
        int[] arr = { 1, 2, 3, 4, 5, 6, 2 };
        Utility.print(arr);
        InsertionSort.insertionSort(arr);
        Utility.print(arr);
    }
    
    public static void insertionSort(int[] arr)
    {
        int j, value;
        // arr.length - 1 index before which array is sorted
        for (int i = arr.length - 1; i < arr.length; i++)
        {
            j = i;
            value = arr[i];
            while (j >= 1 && arr[j - 1] > value)
            {
                arr[j] = arr[j - 1];
                j--;
            }
            
            arr[j] = value;
        }
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
