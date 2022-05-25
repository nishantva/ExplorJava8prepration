package array;

import java.util.HashSet;

/*Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 
1 + 2 = 3 and 3 +2 = 5 */

public class Count_the_triplets {
	
	public static void main(String arg[]) {
		
		int arr[]={1, 5, 3, 2,8};
		int key=16;
		int n=arr.length;
		
		HashSet<Integer> set=new HashSet<Integer> ();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
					if(set.contains((key)-(arr[i]+arr[j]))) {
						System.out.print("yes");
					}
				
				break;
			}
		}
		
	}

}
