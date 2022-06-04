package array;

public class Count1_sin_a_sorted_binaryarray {
	
	public static void main(String arg[]) {
		int arr[]= {1, 1, 0, 0, 0, 0, 0};
		//Output: 2
		int n=arr.length;
		
		System.out.print(countOnes(arr,n));
		
		
		
	}

static int countOnes(int arr[], int n) {
		int left=0;
		int right=n-1;
		
		
		while(right>=left) {
			
			
			int mid=(left+right)/2;
			
			if(arr[mid]<1) {
				right=mid-1;
			}
			else if(arr[mid]>1) {
				left=mid+1;
			}
			else {
				if(mid ==n-1 || arr[mid +1]!=1) {
					return mid+1;
				}
				else {
					left=mid+1;
				}
			}
			
			
		}
		
	return 0;
	}

}
