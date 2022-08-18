package array;

import java.util.ArrayList;
import java.util.Stack;

public class NearestGraterElement {//on right
	
	public static void main(String rg[]) {
		int arr[]= {2,1,6,9,8,12}; //o/p -->6, 6 9 12 12 -1;
		int n=arr.length;
		
		Stack<Integer> st =new Stack<Integer>();
		
		int demo[]=new int [n];
		
	    st.push(arr[n-1]);
	    demo[n-1]= -1;
	    
	    for(int i=n-2;i>=0;i--) {
	    	
	    	
	    	while(!st.isEmpty() && arr[i]>= st.peek()) {
	    		st.pop();
	    	}
	    	if(st.isEmpty()) {
	    		demo[i]=-1;
	    	}
	    	else {
	    		demo[i]=st.peek();
	    	}
	    	st.push(arr[i]);
	    }
	    
	    for(int i=0;i<demo.length;i++) {
	    	System.out.print(" "+demo[i]);
	    }
	}

}
