package algorithms.array;

public class MinHeap {
	private int heapSize;
	private int arr[];

	public MinHeap(int a[], int size) {
		heapSize = size;
		arr = a;  
	    int i = (heapSize - 1)/2;
	    while (i >= 0)
	    {
	        minHeapify(i);
	        i--;
	    }
	}
	
	private void minHeapify(int i) {
		int l = left(i);
	    int r = right(i);
	    int smallest = i;
	    if (l < heapSize && arr[l] < arr[i])
	        smallest = l;
	    if (r < heapSize && arr[r] < arr[smallest])
	        smallest = r;
	    if (smallest != i)
	    {
	        swap(i, smallest);
	        minHeapify(smallest);
	    }
	}

	private void swap(int i, int smallest) {
		int t = arr[i];
		arr[i] = arr[smallest];
		arr[smallest] = t;
	}

	int parent(int i) {
		return (i - 1) / 2;
	}

	int left(int i) {
		return (2 * i + 1);
	}

	int right(int i) {
		return (2 * i + 2);
	}

	int extractMin() {
		if (heapSize == 0)
	        return Integer.MAX_VALUE;
	 
	    // Store the minimum vakue.
	    int root = arr[0];
	 
	    // If there are more than 1 items, move the last item to root
	    // and call heapify.
	    if (heapSize > 1)
	    {
	        arr[0] = arr[heapSize-1];
	        minHeapify(0);
	    }
	    heapSize--;
	 
	    return root;
	}
	
	static int kthSmallest(int arr[], int n, int k)
	{
		MinHeap h = new MinHeap(arr, n);
	    // Do extract min (k-1) times
	    for (int i=0; i<k-1; i++)
	        h.extractMin();
	 
	    // Return root
	    return h.getMin();
	}
	
	int getMin() {
		return arr[0];
	} // Returns minimum
	
	public static void main(String[] args) {
		int arr[] = {12, 3, 5, 7, 19};
		System.out.println(MinHeap.kthSmallest(arr,arr.length,5));
	}
}
