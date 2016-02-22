package algorithms.divideandconquer;

import java.util.Arrays;

public class StockPrice {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,4,6,7};
		System.out.println(Arrays.toString(stockStratgy(arr,0,arr.length)));
	}

	//leftIndex-rightIndex-profit
	private static int[] stockStratgy(int[] arr, int start, int end) {
		if(start == end -1)
		{
			int[] temp = {start,start,0};
			return temp;
		}
		
		int mid = start + (end-start)/2;
		int[] leftS = stockStratgy(arr, start, mid);
		int[] rightS = stockStratgy(arr, mid, end);
		int min = minimum(arr,start,mid);
		int max = maximum(arr,mid,end);
		int tempP = arr[max]-arr[min];
		
		if(leftS[2] > rightS[2] && leftS[2] > tempP)
		{
			return leftS;
		}
		else if(rightS[2] > leftS[2] && rightS[2] > tempP)
		{
			return rightS;
		}
		int[] temp = {min,max,tempP};
		return temp;
	}

	private static int maximum(int[] arr, int start, int end) {
		int maxV = arr[start];
		int maxIndex = start;
		for (int i = start+1; i < end; i++) {
			if(arr[i] > maxV)
			{
				maxIndex = i;
				maxV = arr[i];
			}
		}
		return maxIndex;
	}

	private static int minimum(int[] arr, int start, int end) {
		int minV = arr[start];
		int minIndex = start;
		for (int i = start+1; i < end; i++) {
			if(arr[i] < minV)
			{
				minIndex = i;
				minV = arr[i];
			}
		}
		return minIndex;
	}
}
