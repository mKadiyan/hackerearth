package algorithms.array;

import java.util.Arrays;

public class Permutation {
	//Heap's Algorithm
	public static void perm(int[] list, int n)
	{
	    if(n == 1)
	    {
	        System.out.println(Arrays.toString(list));
	    } 
	    else 
	    {
	        for(int i=0; i<n; i++)
	        {
	            perm(list,n-1);

	            int j = ( n % 2 == 0 ) ? i : 0; 

	            int t = list[n-1];              
	            list[n-1] = list[j];
	            list[j] = t;                
	        }
	    }
	}

	public static void perm(int[] list,int i, int n)
	{
	    if(n == i)
	    {
	        System.out.println(Arrays.toString(list));
	    } 
	    else 
	    {
	        for(int j=i; i<n; i++)
	        {
	        	int t = list[i];              
	            list[i] = list[j];
	            list[j] = t;
	            
	            perm(list,j,n-1);

	             

	            t = list[j];              
	            list[j] = list[i];
	            list[i] = t;                
	        }
	    }
	}

	
	public static void main(String[] args) {

	    int[] list = new int[]{1,2,3}; 
	    perm(list, 0, list.length);
	    System.out.println("==========================================");
	    list = new int[]{1,2,3}; 
	    perm(list,list.length);

	}
}
