package array;

public class ThirdHigest {
	
	public static void main(String arg[]) {
	
	int arr[]= {2,4,6,2,33,21};
	
	
	int first=arr[0];
	int second=Integer.MIN_VALUE;
	int third=Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>first) {
			third=second;
			second=first;
			first=arr[i];
			
		}
		
		else if(arr[i]>second) {
			third=second;
			second=arr[i];
			
		}
		
		else if(arr[i]>third) {
			third=arr[i];
		}
	}
	
	System.out.println(third);

}
}
