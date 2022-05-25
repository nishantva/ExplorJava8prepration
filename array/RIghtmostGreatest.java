package array;

public class RIghtmostGreatest {
	public static void main(String arg[]) {
		int arr[]= {17,5,4,6,18};
		//18 18 18 18 -1
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int[] temp = new int[n];
		
		  
		for(int i=n-1;i>=0;i-- ) {
			if(i==n-1) {
				temp[i]=-1;
			}
			else {
				temp[i]=Math.max(max, arr[i+1]);
				max=temp[i];
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
