class Solution {
    public boolean canJump(int[] nums) {
          if (nums.length == 1)
            return true;
        boolean canReach = false;
        int j = nums.length -1;
        int i = j-1;
        while(j >0)
        {
            while( i>=0 && j-i  > nums[i])
            {
                i--;
            }

            if( i < 0)
            return false;

            if(j-i <= nums[i])
            {
                canReach = true;
            }
            j=i;
            if(i>0)
            i--;
        }

        return canReach;
    }
}
