package array;

import java.util.Arrays;

public class ChocolateDistributionProblem {
	
	public static void main(String arg[]) {
		int arr[]= {3, 4, 1, 9, 56, 7, 9, 12};
		int n=arr.length;
		
		int m=5;
		
		int mindiff=Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		for(int i=0;i<n-m+1;i++) {
			if((arr[i+m-1]  -arr[i])<mindiff) {
				
				mindiff=arr[i+m-1]-arr[i];
				
			}
			
		}
		System.out.print(mindiff);
		
	}

}
