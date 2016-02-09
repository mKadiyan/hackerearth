/*
 * Copyright (c) Mehar  2016 ALL RIGHTS RESERVED.
 *
 * 
 */

package algorithms.sorting;

public class MergeSort
{
    
    public static void main(String[] args)
    {
        int[][] arr = {
            { 3, 5, 7, 1, 23, 56, 4, 2, 3, 5, 100 },
            { 3, 5, 7, 1, 23, 56 },
            { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
            { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
            { 1, 3, 5, 1, 1, 7, 2, 1, 23, 1, 1 },
        };
        
        for (int i = 0; i < arr.length; i++)
        {
            Utility.print(arr[i]);
            int[] temp = new int[arr[i].length];
            MergeSort.mergeSort(arr[i], temp, 0, arr[i].length - 1);
            Utility.print(arr[i]);
            System.out.println();
        }
        
    }
    
    static void mergeSort(int[] arr, int[] temp, int left, int right)
    {
        if (right > left)
        {
            int mid = (right + left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
            
        }
    }
    
    static void merge(int[] arr, int[] temp, int left, int mid, int right)
    {
        int tempPos = left;
        int leftEnd = mid;
        int size = right - left + 1;
        while (left <= leftEnd && mid < right)
        {
            if (arr[left] <= arr[mid + 1])
            {
                temp[tempPos++] = arr[left];
                left++;
            }
            else
            {
                temp[tempPos++] = arr[mid + 1];
                mid++;
            }
        }
        
        while (left <= leftEnd)
        {
            temp[tempPos++] = arr[left];
            left++;
            
        }
        while (mid < right)
        {
            
            temp[tempPos++] = arr[mid + 1];
            mid++;
        }
        
        for (int i = 0; i < size; i++)
        {
            arr[right] = temp[right];
            right--;
        }
        
    }
}

/*
 * Copyright (c) Mehar 2016 ALL RIGHTS RESERVED
 */
