package array;

public class Longest_Increasing_Subsequence {

	public static void main(String arg[]) {

		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };

		int n = arr.length;

		int omax = 0;

		int dp[] = new int[n];
		
		for(int i=0;i<n;i++) {
				dp[i]=1;
		}

		for (int i = 0; i < dp.length; i++) {
			//int max = 0;
  
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {// compare very piche wale se
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}

		}
		
		for(int i=0;i<n;i++) {
			omax=Math.max(omax, dp[i]);
		}
		System.out.println(omax);
	}
}
