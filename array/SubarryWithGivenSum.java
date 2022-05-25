package array;

import java.util.HashMap;

public class SubarryWithGivenSum {

	
	public static void main(String arg[]) {
		
		int arr[]= {1,2,3,7,5};
		int k=6;
		int cursum=0;
		int start=0;
		int end=-1;
		
		HashMap<Integer ,Integer > map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			cursum+=arr[i];
			
			if(cursum-k==0) {
			   start=0;
			   end=i;
				
			}
			if(map.containsKey(cursum-k)) {
				start=map.get(cursum-k)+1;
				end=i;
				
			}
			map.put(cursum, i);//sum,position
			
		}
		System.out.print(arr[start]+" "+arr[end]);
		
	}
}
