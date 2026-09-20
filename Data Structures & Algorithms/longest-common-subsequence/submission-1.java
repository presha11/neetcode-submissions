class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
           for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
         return dfs( text1 , text2 ,text1.length() -1 , text2.length() -1 ,dp);

    }


    public int dfs(String text1 , String text2 , int t1 , int t2 ,int[][] dp)
    {
         if( t1<0 || t2<0)
         {
            return 0;
         }
         if(dp[t1][t2]!=-1)
         return dp[t1][t2];
         if(text1.charAt(t1) == text2.charAt(t2))
         {
            return dp[t1][t2] =  1 + dfs( text1 , text2 , t1-1 , t2-1 , dp);
         }


         return dp[t1][t2] = Math.max(dfs(text1 , text2 , t1-1 , t2 ,dp) , dfs( text1 ,text2 , t1 ,t2-1 ,dp));
    }
}

