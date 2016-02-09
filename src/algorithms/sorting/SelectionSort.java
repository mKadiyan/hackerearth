/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.sorting;

public class SelectionSort
{
    public static void main(String[] args)
    {
        // int[] arr = { 3, 5, 7, 1, 23, 56, 4, 2, 3, 5, 100 };
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Utility.print(arr);
        SelectionSort.selectionSort(arr);
        Utility.print(arr);
    }
    
    public static void selectionSort(int[] arr)
    {
        int min;
        for (int i = 0; i < arr.length; i++)
        {
            min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
