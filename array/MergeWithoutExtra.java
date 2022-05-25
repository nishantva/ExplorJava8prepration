package array;

import java.util.Arrays;

public class MergeWithoutExtra {
	
	public static void main(String arg[]) {
		int n = 4;
			int 	m = 5;
					
					int arr1[]= {1 ,3 ,5 ,7};
		            int arr2[]= {0, 2 ,6 ,8 ,9};
		            
		            
		            int i=n-1;
		            int j=0;
		            while(i>=0 &&  j<m) {
		            	
		            	if(arr1[i]>arr2[j]) {
		            		int temp=arr1[i];
		            		arr1[i]=arr2[j];
		            		arr2[j]=temp;
		            		i--;
		            		j++;
		            	}
		            	 else{
		                     break;
		                 }
		            	
		            	
		            }
		            Arrays.sort(arr1);
		            Arrays.sort(arr2);
		            
		            for(int p=0;p<n;p++) {
		            	System.out.print(arr1[p]);
		            }
		            for(int p=0;p<m;p++) {
		            	System.out.print(arr2[p]);
		            }
	}

}
