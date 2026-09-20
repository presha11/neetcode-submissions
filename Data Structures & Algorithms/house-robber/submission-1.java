class Solution {

    int[] cache;
    public int rob(int[] nums) {
  
        int n = nums.length;
         cache = new int[n];
             for(int i = 0 ; i < n; i++)
        { cache[i] = -1;}

      return   dfs(n-1 , nums);



    }

    public int dfs(int n , int[] nums)
    {


        if(n == 0)
        return nums[n];

        if(n<0)
        return 0;
        if(cache[n] != -1)
        return cache[n];
        
        int pick   = nums[n] + dfs(n-2, nums);
        int notPick = 0 + dfs(n-1, nums);

        return cache[n] =  Math.max(pick , notPick);
    }
}
