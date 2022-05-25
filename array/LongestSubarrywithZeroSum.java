package array;

import java.util.HashMap;

public class LongestSubarrywithZeroSum {
	
	public static void main(String arg[]) {
		
		int arr[]= { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n=arr.length;
		
		 HashMap<Integer, Integer> hm = new HashMap<>();
		 
		 hm.put(0,0);
		 int length =-1;
		 int cumSum=0;
		 
		 for(int i=0;i<n;i++) {
			 cumSum=cumSum+arr[i];
			 
			 if(hm.containsKey(cumSum)) {
				 length=Math.max(length, i-hm.get(cumSum)+1);
			 }
			 else {
				 hm.put(cumSum, i+1);
			 }
			 
		 }
		System.out.print(length);
	}

}
