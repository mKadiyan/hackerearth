package algorithms.array;

import java.util.Arrays;

public class MaxHeap {

	private int[] arr;

	public MaxHeap(int[] arr) {
		this.arr = arr;
		for(int i=(arr.length-1)/2;i>=0;i--)
		{
			maxHeapify(i);
			System.out.println(Arrays.toString(arr));
		}
	}

	void maxHeapify(int index) {
		
		int l= getLeft(index);
		int r = getRight(index);
		int max = index;
		
		if(l < arr.length && arr[l] > arr[index])
			max = l;
		if(r < arr.length && arr[r] > arr[max])
			max = r;
		
		if(max !=index)
		{
			swap(max,index);
			maxHeapify(max);
		}
	}

	private void swap(int max, int index) {
		int t = arr[max];
		arr[max] = arr[index];
		arr[index] = t;
	}

	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private int getLeft(int index) {
		return index * 2 + 1;
	}
	
	private int getRight(int index) {
		return index * 2 + 2;
	}
	
	int getMax()
	{
		return arr[0];
	}
	
	static int kthLargest(int arr[], int k)
	{
		MaxHeap h = new MaxHeap(arr);
	    // Do extract min (k-1) times
	    for (int i=0; i<k-1; i++)
	        h.extractMax();
	 
	    // Return root
	    return h.getMax();
	}
	
	private void extractMax() {
		arr[0] = arr[arr.length-1];
		maxHeapify(0);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,6,17,18,19,20,21,22,23,24,25,0};
		System.out.println(MaxHeap.kthLargest(arr, 20));
		
	}
}
