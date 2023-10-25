
public class FindWaterInGlass {
	
	public static void main(String arg[]) {
		int k=8,r=2,c=1;
		
		//k will be the water and r and c is row and column//
		
		int [][] dp= new int [k+1][k+1];
		
		dp[0][0]=k;
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {
				if(dp[i][j]>1) {
					int spare  =dp[i][j]-1;
					dp[i][j]=1;
					dp[i+1][j]=spare/2;
					dp[i+1][j+1]=spare/2;
				}
			}
		}
		
		System.out.print(dp[r][c]);
		
		
	}

}
