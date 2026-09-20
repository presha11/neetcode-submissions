class Solution {
    public int rob(int[] nums) {
        
        int dp[]  = new int[nums.length];

        dp[0] = nums[0];
        int neg = 0;

        for(int i = 1 ; i<nums.length;i++)
        {

            int take = nums[i] + (i>1 ?  dp[i-2] : 0);

            int nottake = 0 + dp[i-1];
            dp[i] = Math.max(take , nottake);
        }

        return dp[nums.length-1];
    }
}
