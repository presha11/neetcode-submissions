class Solution {
    int sum =0;
    public boolean canPartition(int[] nums) {
        int targetSum =0;
        for(int i : nums)
        {
            targetSum+=i;
        }

        if(targetSum %2!=0)
        return false;
         return dfs(nums , targetSum/2 , 0);
    }


    public boolean dfs(int[] nums , int targetSum ,int i)
    {
      if(i == nums.length)
      {
        return false;
      }

      if(targetSum==0)
      {
        return true;
      }
      
      
        if(nums[i] <=targetSum)
        {
            return dfs(nums , targetSum - nums[i],i+1) || dfs(nums , targetSum , i+1);  

      }

      else
      return dfs(nums , targetSum , i+1); 

    }
}
