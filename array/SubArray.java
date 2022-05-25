package array;

import java.util.HashMap;

public class SubArray {

	public static void main(String arg[]) {
		
		int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};
		int key=0;
		
		subArray(arr,key);
	}

	private static void subArray(int[] arr, int key) {
		int currsum=0;
		int start=0;
		int end=-1;
        int count=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			currsum+=arr[i];
			
			if(currsum-key==0) {
				start=0;
				end=i;
				break;
			}
			
			if(map.containsKey(currsum-key)) {
				count++;
				start=map.get(currsum-key)+1;
				end=i;
			}
			map.put(currsum, i);
		}
		if(end==-1) {
			System.out.print("not found");
		}
		else {
			System.out.println(count);
		}
		
	}

}
