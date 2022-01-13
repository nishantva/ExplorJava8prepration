package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	
	
	public static void main(String arg[]) {
		
		List<Integer> list =new ArrayList<Integer> ();
		list.add(2);
		list.add(5);
		list.add(4);
		int n=list.size();
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=list.get(i);
		}
		Arrays.sort(arr);
		int sum=arr[n-1];
		for(int i=n-2;i>=0;i--) {
    			sum=sum-arr[i];
    			System.out.print(sum);
		}
		
	}

}
