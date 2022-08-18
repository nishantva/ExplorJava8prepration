package array;

/*
you are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps or 3 steps. In how many distinct ways can you climb to the top?*/
public class Count_number_of_hops {
	
	public static void main(String arg[]) {
     int n=54;
     System.out.print(CountPair(n));
    
     
	}

	
	public static long CountPair(int n) {
		 int dp[] =new int[n+1];
	     dp[0]=1;
	     for(int i=1;i<=n;i++) {
	    	 if(i==1) {
	    		 dp[i]= dp[i-1];
	    	 }
	    	 else if(i==2) {
	    		 dp[i] =dp[i-1]+dp[i-2];
	    	 }
	    	 else {
	    		 dp[i] =dp[i-1]+dp[i-2]+dp[i-3];
	    	 }
	    	 
	    	 
	     }
		return dp[n];
	}
}
