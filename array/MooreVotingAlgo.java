package array;

public class MooreVotingAlgo {
	
	public static void main(String arg[]) {
		int arr[]= {1,2,3,-2,5};
		
	int curr=arr[0];
	int prev=arr[0];
	for(int i=1;i<arr.length;i++) {
		curr=Math.max(arr[i], curr+arr[i]);
	}
	
	if(prev<curr) {
		prev=curr;
	}
	System.out.print(prev);
	}
 
}
