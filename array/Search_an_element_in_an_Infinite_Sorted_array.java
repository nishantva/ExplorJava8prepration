package array;

public class Search_an_element_in_an_Infinite_Sorted_array {
	
	public static void main(String arg[]) {
		///infinitearray input
		
		binary(arr,target);
		
	}
	
	public static int binary(int arr[],int target) {
		int start=0;
		int end=1;
		
		while(target> arr[end]) {
			start=end;
			end=2*end;
		}
		
		
		while(start<=end) {
			int mid= (start+end)/2;
			
			
			if(target==arr[mid]) {
				return mid;
				
			}
			else if(target <arr[mid]) {
				
				end=mid-1;
				
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
