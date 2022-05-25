package array;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_k {
	
	public static void main(String arg[]) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer> ();
		int arr[]= {4,5,0,-2,-3};
		int k=5;
		int n=arr.length;
		map.put(0, 1);
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			int reminder=sum%k;
			if(reminder<0) {
               reminder+=k;
			}
			if(map.containsKey(reminder)) {
				count +=map.get(reminder);
			}
			map.put(sum, map.get(sum)+1);
		}
	}

}
