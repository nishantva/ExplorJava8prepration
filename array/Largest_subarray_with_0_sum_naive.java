package array;

public class Largest_subarray_with_0_sum_naive {
	
	public static void main(String arg[]) {
		int arr []= {15,-2,2,-8,1,7,10,23};
		//5
		int n=arr.length;
		
		int max=0;
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				 sum=sum+arr[j];
				 
				if(sum==0) {
					max=Math.max(max, j-i+1);
				}
			}
		}
		
		System.out.print(max);
	}

}
