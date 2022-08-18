package array;

import java.util.Stack;

public class FindNextGreaterInCircularArray {
	public static void main(String arg[]) {
		int arr[]= {1,2,3,4,3}; //[2,3,4,-1,4]
		int n=arr.length;
		
		int result[] =new int[n];
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=n-1;i>=0;i--) {
			st.push(i);
		}
		
		for(int i=n-1;i>=0;i--) {
			result[i]=-1;
			
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				st.pop();
				
			}
			if(!st.isEmpty()) {
				result[i]=arr[st.peek()];
				
			}
			st.add(i);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.print(" "+result[i]);
		}
	}

}
