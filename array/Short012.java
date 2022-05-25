package array;

public class Short012 {
	public static void main(String arg[]) {
		int arr[]= {2,0,1,2,0,1,2,1,0,2,2,2};
		int low=0;
		int high=arr.length-1;
		int mid=0;
		int temp;
		
		while(mid<=high) {
			if(arr[mid]==0) {
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			if(arr[mid]==1) {
				mid++;
			}
			if(arr[mid]==2) {
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
