class Solution {
    public int longestConsecutive(int[] nums) {
        int res= 1;
      Arrays.sort(nums);
      if(nums.length ==0 )
      return 0;
      int  streak = 1;
      for(int i = 1 ; i < nums.length ; i ++)
      {
        if(nums[i] == nums[i-1])
        {
            continue;
        }

        else if(nums[i] == nums[i-1]+1)
        {
            streak++;
        }

        else
        {streak = 1;}
        res = Math.max(streak, res);
      }
    return res;

    }

}
