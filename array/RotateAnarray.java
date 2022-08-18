  package array;

public class RotateAnarray {
	public static void main(String arg[]) {
		
		 int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		 //3 4 5 6 7 1 2 
		 
		 int n=arr.length;
		 int d=2;
		 
		 reverseleft(arr,d,n);
		 for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
	}

	private static void reverseleft(int[] arr, int d, int n) {
		rotate(arr,0,d-1);
		rotate(arr,d,n-1);
		rotate(arr,0,n-1);
		
		
	}

	private static void rotate(int[] arr, int i, int j) {
		
		
		while(j>i) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

	
	
	
}
