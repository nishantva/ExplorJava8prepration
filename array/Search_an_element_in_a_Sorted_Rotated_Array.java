package array;

public class Search_an_element_in_a_Sorted_Rotated_Array {
	
	public static void main(String agr[]) {
		int arr[]= {4,5,6,7,0,1,2};
		int key=7;
		int low=0;
		int high=arr.length-1;
		
		while(high>low) {
			int mid=(high+low)/2;
			if(arr[mid]==key) {
				System.out.println("this this the position-->"+mid);
			}
			
			if(arr[low]<arr[mid]) {//left part sorted compare o th element with mid element
				if(key>arr[low] && key< arr[mid]) {// key present or not in soreted part
					high=mid-1;
					
				}
				else {
					low=mid+1;
				}
			}
			else {//right part sorted
				if(key<arr[high] && key>arr[mid]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
	}

}
