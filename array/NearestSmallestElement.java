 package array;

import java.util.Stack;

public class NearestSmallestElement {//onleftside
public static void main(String arg[]) {
	int arr[]= {2,1,6,9,8,12}; //o/p --  -1-11668
	int n=arr.length;
	
	Stack<Integer> st =new Stack<Integer>();
	
	
	for(int i=0;i<arr.length;i++) {
		while(!st.isEmpty() && st.peek()>arr[i]) {
			st.pop();
		}
		
		if(st.isEmpty()) {
			System.out.print("-1");
		}
		else {
			System.out.print(st.peek());
		}
		st.push(arr[i]);
	}
	
}
}
