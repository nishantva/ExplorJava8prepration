package array;

import java.util.HashMap;

public class longest_subarray_equal_number_0_and_1 {
	public static void main(String arg[]) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		
		int n=arr.length;
		int ans=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		//initally put 0 at -1 position
		map.put(0, -1);
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				sum+=-1;
			}
			else if(arr[i]== 1) {
				sum+=1;
			}
			
			if(map.containsKey(sum)){
				int length= i-map.get(sum);
				
				if(length > ans) {
					ans=length;
				}
				else {
					map.put(sum, i);
				}
			}
		}
		
		System.out.print(ans);
	}

}
