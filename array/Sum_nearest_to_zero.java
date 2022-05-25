package array;

import java.util.Arrays;

/*Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to 
zero is -68 using numbers -60 and -8.
*/
public class Sum_nearest_to_zero {
	public static void main(String arg[]) {
		int arr[]= {-8, -66, -60};
		int n=3;
		int left=0;
		int right=arr.length-1;
		int closesum=Integer.MAX_VALUE;
		int currentsum=0;	
		Arrays.sort(arr);
		
		while(right>left) {
			
			currentsum=arr[right]+arr[left];
			
			
			if(Math.abs(currentsum)<Math.abs(closesum)) {
				closesum=currentsum;
				
				
			}
			
			if(currentsum<0) {
				left++;
			}
			else {
				right--;
			}
		
			
		}
		
		System.out.println(closesum);
	}

}
