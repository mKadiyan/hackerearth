/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 7, 1, 23, 56, 4, 2, 3, 5, 100 };
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        Utility.print(arr);
        // BubbleSort.bubbleSort(arr);
        BubbleSort.bubbleSortImproved(arr);
        Utility.print(arr);
    }
    
    public static void bubbleSort(int[] arr)
    {
        for (int i = arr.length - 1; i >= 0; i--)
        {
            for (int j = 0; j <= i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    }
    
    public static void bubbleSortImproved(int[] arr)
    {
        boolean swapped = true;
        for (int i = arr.length - 1; i >= 0 && swapped; i--)
        {
            swapped = false;
            for (int j = 0; j <= i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        
    }
    
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
