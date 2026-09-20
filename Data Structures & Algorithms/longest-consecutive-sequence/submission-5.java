class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
          int maxCount = 0;
        for(int n : nums)
        {
            set.add(n);
        }

        for(int n : nums)
        {  int count=0 ;
            if(set.contains(n-1))
            continue;
            else
            while(set.contains(n))
            {
                count++;
                n++;
            }
            maxCount = Math.max(count , maxCount);
        }

        return maxCount;
    }
}
