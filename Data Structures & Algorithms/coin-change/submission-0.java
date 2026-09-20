class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp , -1);
        int minCoins = dfs(coins ,amount , dp);

        return minCoins >= Integer.MAX_VALUE ? -1 :minCoins;
    }


    public int dfs(int[] coins,int amount , int[] dp)
    {  
        if(dp[amount] != -1)
        return dp[amount];
       if(amount ==0)
       return 0;

       int res = Integer.MAX_VALUE;
        for(int i =0;i< coins.length ; i++)
        if (amount - coins[i] >= 0) {
        int subResult  =  dfs(coins, amount - coins[i] , dp);
        if(subResult != Integer.MAX_VALUE)
        {
            res = Math.min( res , 1 + subResult);
        }
        dp[amount] = res;


    }
    return res;
    
    }
}
