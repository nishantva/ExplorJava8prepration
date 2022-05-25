 package array;

import java.util.HashMap;

public class SubtringSumnZero {
	
	//nive approch
	public static void  main(String arg[]) {

		int arr[]= {15 ,-2 ,2 ,-8 ,1 ,7 ,10 ,23};
		int n=arr.length;
		
		int count=0;
		
		
		for(int i=0;i<n;i++) {
			int sum=0;
			
			for(int j=i;j<n;j++) {				
				sum+=arr[j];
				
				
				if(sum==0) {
					count++;
				}
				
			}
			
		}
	
	System.out.print(count++);	
	}

}
