Input: s1 = "ABCDGH", s2 = "ACDGHR"
Output: 4
Explanation: The longest common substring is "CDGH" with a length of 4.
// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int m= s1.length();
        int n=s2.length();
        
        int dp[][] =new int [m+1][n+1];
        
        int maxLength=0;
        
        for(int i=1;i<=m;i++){
            
            for(int j=1;j<=n;j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1]+1;
                    
                    maxLength = Math.max(dp[i][j],maxLength);
                }
                else{
                    dp[i][j]= 0;
                }
            }
            
        }
        return maxLength;
        
    }
}
  
