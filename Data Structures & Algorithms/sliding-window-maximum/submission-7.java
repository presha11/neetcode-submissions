class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length -k+1];

        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < nums.length; i++)
        {
            while(!queue.isEmpty() && queue.getFirst() <= i-k)
            {
                queue.pollFirst();
            }

            while(!queue.isEmpty() && nums[queue.getLast()] <= nums[i])
            {
                queue.pollLast();
            }

            queue.addLast(i);

            if( i >= k-1)
            {
                result[i-k+1] = nums[queue.getFirst()];
            }
        }

        return result;
    }
}
