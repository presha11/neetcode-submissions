class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;

        int[] nu = new int[n];
          int[] nu1 = new int[n];
 if(nums.length ==1)
 return nums[0];
        for(int i = 0 ; i < n ; i++)
        {
            if(i!=0)
            {
                 nu[i] = nums[i];
            }
            if(i!=n-1)
            {
                nu1[i] =  nums[i];
            }
        }

        return Math.max(dfs(nu), dfs(nu1));
    }


    public int dfs(int[] nums)
    {
        int prev = nums[0];
        int prev2 = 0 ;

        for(int i =1 ;  i < nums.length ; i++)
        {
          int take = nums[i] ;
          if(i>1)
          take+= prev2;

          int nottake = 0 + prev;
          int curr = Math.max(take , nottake);
        prev2= prev;
        prev = curr;

        }
     return prev;
    }
}
