package array;

public class ImmediateSmaller {
	
	
	public static void main(String arg[]) {
		int arr[]= {4,2,1,5,3};
		int n=arr.length;
		int com=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				System.out.print(" "+arr[i]);
			}
			else {
				System.out.print(" "+"-1");
			}
		}
		System.out.print(" "+"-1");
		
	}

}
