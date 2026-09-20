class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum= Integer.MIN_VALUE;
         int sum= Integer.MIN_VALUE;

        for(int n : nums)
        {
            if( sum < 0)
            {
                sum = 0;
            }

            sum = sum + n;

            maxSum = Math.max(sum , maxSum);
        }
        return maxSum;
    }
}
