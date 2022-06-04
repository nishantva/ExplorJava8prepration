package array;

import java.util.Arrays;

public class Segregate_Even_and_Odd_numbers {
	
	public static void main(String arg[]) {
		int arr[]=  {12, 34, 45, 9, 8, 90, 3};
		int n=arr.length;
		
		StringBuffer a= new StringBuffer();
		StringBuffer b= new StringBuffer();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				a.append(arr[i]);
			}
			else {
				b.append(arr[i]);
			}
		}
		
		System.out.print(a);
		System.out.print(b);
	}

}
