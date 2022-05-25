package array;

public class EquilibriumPoint {
	public static void main(String arg[]) {
	
	int arr[] = {1,3,5,2,2};
	int n=arr.length;
	int sum=0,left=0;
	int res=0;
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		
	}
	
	for(int i=n-1;i>=0;i--) {
		sum=sum-arr[i];
		
		if(sum==left) {
			res=arr[i];
		}
		left=left+arr[i];
	}

	System.out.print("this is the point-->"+res);
	
}
}
