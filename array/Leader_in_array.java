package array;

public class Leader_in_array {
	public static void main(String arg[]) {
		int arr[]= {16,17,4,3,5,2};
		//17 5 2 
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		String s="";
		
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				s=max+" "+s;
			}
		}
		System.out.print(s);
	}

}
