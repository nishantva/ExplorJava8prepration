import java.util.ArrayList;
import java.util.Arrays;

//slidingwindow
public class MaxSumSubarrayofsizeK {
	
	
	public static void main(String arg[]) {
		int N = 4, K = 2;//k window size
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays. asList(100, 200, 300, 400));
		
		long sum=0;
		
		for(int i=0;i<K;i++) {
			sum+=arr.get(i);
			
		}
		
		int start=0;
		long csum=sum;
		
		for(int i=K;i<N;i++) {
			csum=csum+arr.get(i)-arr.get(start);
			
			sum=Math.max(sum, csum);
			start++;
		}
		
		
		System.out.print(sum);
	}

}
