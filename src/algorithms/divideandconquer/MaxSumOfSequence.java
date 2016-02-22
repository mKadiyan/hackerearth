package algorithms.divideandconquer;

public class MaxSumOfSequence {
	public static void main(String[] args) {
		int[] arr = {4,-8,2,4,5,-120,-30,100,-80,25,50,10};
		System.out.println(maxSeqSum(arr,0,arr.length));
	}

	private static int maxSeqSum(int[] arr, int start, int end) {
		
		int mid =  start +(end-start)/2;
		if(start == mid)
			return arr[start];
		int leftS = maxSeqSum(arr, start, mid);
		int rightS = maxSeqSum(arr, mid, end);
		
		int sum = 0 ;
		int lSum= Integer.MIN_VALUE;;
		for(int i=mid-1;i>=start;i--)
		{
			sum +=arr[i];
			if(sum > lSum)
				lSum = sum;
		}
		
		sum = 0 ;
		int rSum= Integer.MIN_VALUE;
		for(int i=mid;i<end;i++)
		{
			sum +=arr[i];
			if(sum > rSum)
				rSum = sum;
		}
		
		
		int max = getMax(leftS, rightS, rSum+lSum);
		return max;
	}
	
	static int getMax(int a, int b, int c)
	{
		return Math.max(Math.max(a, b),c);
				
	}
}
