package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
	
	public static void main(String arg[]) {
		String arr[]= {"3", "30", "34", "5", "9"};
		
		int n=arr.length;
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
             
	}
);
}
}
