package array;

import java.util.PriorityQueue;

public class Largest_Smallest_Element {
	
	public static void main(String arg[]) {
		int arr[]= {1, 23, 12, 9, 30, 2, 50};
		int k=3;
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		for(int i=0;i<k;i++) {
			queue.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			if(queue.peek()<arr[i]) {
				
				queue.poll();//pop
				queue.add(arr[i]);
				
				
			}
		}
		System.out.print(queue.peek());
	}

}
