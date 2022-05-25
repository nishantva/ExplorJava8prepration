package array;

import java.util.HashMap;

/*Input: arr[] = {1, 2, 1, 3, 4, 2, 3};
k = 4
Output: 3 4 4 3*/
public class Count_distinct_elements_window_size_k {
	
	public static void main(String arg[]) {
		
		   int arr[] = { 1, 2, 1, 3, 4, 2, 3 }, k = 4;
		   int count=0;
		   int n=arr.length;
		   
		   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		   
		   for(int i=0;i<k;i++) {
			   map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		   }
		   
		   System.out.println(map.size());
		   
		   for(int i=k;i<n;i++) {
			   
			   //remove first element foemt he previous window//

			   if(map.get(arr[i-k])==1) {
				   map.remove(arr[i-k]);
			   }
			   
			   else {
				   map.put(arr[i-k], map.get(arr[i-k])-1);
				   
			   }
			// Add new element of current window
	            // If this element appears first time,
	            // set its count as 1,
			   
			   map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			   
			   System.out.println(map.size());
			   
		   }
	
	}

}
