class Solution {
    public int longestConsecutive(int[] nums) {
        int len = 0 ;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }

        for(int num : nums)
        {
            int streak = 0 ; 
            int current = num;
            while(set.contains(current))
            {
                streak++;
                current++;
            }
            len = Math.max(len , streak);
             }
             return len;

    }
}
