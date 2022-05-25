package array;

import java.util.HashMap;

public class Find_repeating_and_missing {
	
	
	public static void main(String arg[]) {
		int arr[]={3, 1, 3};
		int n=arr.length;
		HashMap<Integer,Boolean>  numbermap =new HashMap<Integer,Boolean> ();
		//for the value at i the position
		for(Integer i: arr) {
			if(numbermap.get(i)==null) {
				numbermap.put(i, true);
			}
					else {
				System.out.println("repated number"+i);
			}
		}
		
		//normal traverse array
		for(int i=1;i<n;i++) {
			if(numbermap.get(i)==null) {
				System.out.println("missing number"+i);
			}
		}
		
	
	}

}
