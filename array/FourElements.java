package array;

import java.util.Arrays;

public class FourElements {
	
	
	public static void main(String arg[]) {
		int arr[]={1, 5, 1, 0, 6, 0};
		int n=arr.length;
		int k=7;
		//n3
		Arrays.sort(arr);
		for(int i=0;i<n-3;i++) {
			
			for(int j=i+1;j<n-2;j++) {
				
				int  l=j+1;
			int r=n-1;
			
			while(r>l) {
				
				if(arr[i]+arr[j]+arr[l]+arr[r]==k) {
					
					System.out.println(" "+arr[i]+" "+arr[j]+" "+arr[l]+" "+arr[r]);
					
					l++;
					r--;
					
				}
				else if(arr[i]+arr[j]+arr[l]+arr[r] <k) {
					l++;
				}
				else {
					r--;
				}
			}
				
			}
		}
	}

}
