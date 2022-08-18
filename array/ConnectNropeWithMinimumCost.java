 package array;

import java.util.PriorityQueue;

public class ConnectNropeWithMinimumCost {
	
	public static void main(String arg[]) {
		int arr[]= {4, 3, 2, 6};
		
		int n=arr.length;
		
		PriorityQueue<Integer>  pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
		}
		
		int ans=0;
		while(pq.size()>1) {
			int first=pq.poll();
			int second=pq.poll();
			int sum=first+second;
			ans+=sum;
			pq.add(sum);
		}
		System.out.print(ans);
		
		
	}

}
