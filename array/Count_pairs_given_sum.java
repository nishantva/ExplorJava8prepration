 package array;

import java.util.HashMap;

public class Count_pairs_given_sum {

	
	public static void main(String arg[]) {
		 int arr[] = { 2, 2, 2, 2, 2};
		    int n = arr.length;
		    int sum = 4;
		    
		    HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		    int count=0;
		    for(int i=0;i<n;i++) {
		    	if(map.containsKey(sum-arr[i])) {
		    		count+=map.get(sum-arr[i]);
		    	}
		    	if(map.containsKey(arr[i])) {
		    		map.put(arr[i], map.get(arr[i])+1);
		    		
		    	}
		    	else {
		    		map.put(arr[i], 1);
		    	}
		    }
		    
		    System.out.print(count);
	}
}
