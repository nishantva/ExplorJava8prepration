//int arr[] = {1,2,3,4,5,6}; // array to be rotated
//int k=2; //number of rotations

package test;

public class ArrayTest {
	
	
	public static void main(String arg[]) {
		int arr[] = {1,2,3,4,5,6};
		int k=3;
		int n=arr.length;
		    int r=n-k;
		    
		for(int i=n-k;i<n;i++) {
			System.out.print(arr[i]+",");	
		
		}
		
	  for(int i=0;i<n-k;i++) {
			System.out.print(arr[i]+",");
	  }
		
		
			
		
	}

}



