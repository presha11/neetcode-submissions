class Solution {
    public int climbStairs(int n) {
      int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return dfs(n , dp);


}


public int dfs(int n , int[] dp )
{
  if(n==0 )
  return 1;

  if(n==1 )
  return 1;
   if(dp[n]!= -1)
   return dp[n];

  return dp[n] =  dfs(n-1,dp)+dfs(n-2,dp);
}
}
