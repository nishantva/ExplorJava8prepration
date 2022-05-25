package array;

import java.util.HashMap;

public class Frequency {
	public static void main(String arg[]) {
		int arr[]= {1,2,1,3,4,5,3,2,2};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			
			int x=map.get(arr[i]);//.get return the value
			x++;
			map.put(arr[i],x);
		}
		else {
			map.put(arr[i], 1);
		}
			
		}
		
		for(Integer i : map.keySet()) {
		int p=map.get(i);
		if(p==3) {
			System.out.println(i+" ");
		}
		}
		System.out.println(map);
	}

}
