class Solution {
   
    public boolean canPartition(int[] nums) {
       
        int targetSum =0;
        for(int i : nums)
        {
            targetSum+=i;
        }

        if(targetSum %2!=0)
        return false;
        int sum = targetSum/2 ;
        boolean[][] t = new boolean[nums.length+1][sum+1];
         int n = nums.length;
        for(int i = 0 ; i <=n ; i++)
       {
        t[i][0] = true;
        
       }
       for(int j = 1 ; j <=sum  ; j++)
       {
        t[0][j] = false;
       }

       for(int i = 1 ; i <=n;i++)
       {
        for(int j = 1 ; j <= sum ; j++)
        {
          if(nums[i-1] <= j)
          t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
          else
          t[i][j] = t[i-1][j];
        }
       }

   return t[n][sum];
    }
}


//     public boolean dfs(int[] nums , int targetSum ,int i)
//     {
//       if(i == nums.length)
//       {
//         return false;
//       }

//       if(targetSum==0)
//       {
//         return true;
//       }
      
      
//         if(nums[i] <=targetSum)
//         {
//             return dfs(nums , targetSum - nums[i],i+1) || dfs(nums , targetSum , i+1);  

//       }

//       else
//       return dfs(nums , targetSum , i+1); 

//     }
// }
