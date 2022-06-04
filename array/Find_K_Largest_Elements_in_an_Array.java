package array;

import java.util.PriorityQueue;

public class Find_K_Largest_Elements_in_an_Array {
	
	public static void main(String arg[]) {
		int arr[] = {12, 5, 787, 1, 23};
		int k = 2;
		int n=arr.length;
		
		  PriorityQueue<Integer> pq = new PriorityQueue<>();
		  
		  for(int i=0;i<n;i++) {
			  if(i<k) {
				  pq.add(arr[i]);
			  }
			  else {
				  if(arr[i]>pq.peek()) {
					  pq.remove();
					  pq.add(arr[i]);
					  
				  }
			  }
		  }
		  
		  while(!pq.isEmpty()) {
			  System.out.print(" "+pq.remove());
		  }
	}

}
