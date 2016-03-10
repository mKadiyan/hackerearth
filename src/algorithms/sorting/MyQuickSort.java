package algorithms.sorting;


public class MyQuickSort
{
    
    public static void main(String a[])
    {
        
        // int[] input = { 10, 12, 4, 6, 3, 9, 1 };
        // quickSort(input, 0, input.length - 1);
        // Utility.print(input);
        
        int[] input1 = { 10, 12, 4, 6, 3, 9, 1 };
        System.out.println(kthElement(input1, 0, input1.length - 1, 7));

    }
    
    private static int kthElement(int[] input, int low, int high, int k)
    {
        if (k > 0)
        {
            int pivot = getPivot(input, low, high);
            Utility.print(input);
            System.out.println("low = " + low + " ,high = " + high + " , k = " + k + ", pivot = " + pivot);
            if (pivot + 1 == k)
                return input[pivot];
            else if (pivot > k - 1)
                return kthElement(input, low, pivot - 1, k);
            return kthElement(input, pivot + 1, high, k - pivot - 1);
            
        }
        return Integer.MAX_VALUE;
    }
    private static void quickSort(int[] input, int low, int high)
    {
        if (high > low)
        {
            System.out.println("low = " + low + " ,high = " + high);
            int pivot = getPivot(input, low, high);
            quickSort(input, low, pivot - 1);
            quickSort(input, pivot + 1, high);

        }
        
    }
    
    private static int getPivot(int[] input, int low, int high)
    {
        int pivot = low;
        int start = low + 1;
        int end = high;
        while (start <= end)
        {
            if (input[pivot] >= input[start])
            {
                start++;
                continue;
            }
            if (input[end] > input[pivot])
            {
                end--;
                continue;
            }
            swap(input, start++, end--);
            Utility.print(input);
        }
        swap(input, pivot, end);
        return end;
    }
    
    private static void swap(int[] input, int start, int end)
    {
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
        
    }
    
}