class Solution {
    public int climbStairs(int n) {
      int[] cache = new int[n+1];
        for (int i = 0; i <= n; i++) {
            cache[i] = -1;
        }
      return   dfs(n ,cache );

    }

    public int dfs(int n , int[] result )
    {
        if(n<=1)
        return 1;

        if(result[n] >=0)
        { return result[n];}

        else
        return  result[n] = dfs(n-1, result)+ dfs(n-2 , result);
    }
}