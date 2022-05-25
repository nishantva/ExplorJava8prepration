package array;

import java.util.Arrays;

public class RemoveDplicate {
	
	public static void main(String arg[]) {
		int arr[]= {2,5,3,4,5,79,9,9,9,2,3};
		int n=arr.length;
		
		Arrays.sort(arr);
	n=	duplicate(arr,n); 
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
		
	}
	
	
	public static int duplicate(int arr[],int n) {
		 int j=0;
		  for (int i = 0; i < n-1; i++)
	            if (arr[i] != arr[i+1])
	                arr[j++] = arr[i];
	      
	        arr[j++] = arr[n-1];
	        
	        return j;
		
		
	
}
}


