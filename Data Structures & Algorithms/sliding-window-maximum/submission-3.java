class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int n = nums.length ;
         int[] output = new int[n - k+1];
         Deque<Integer> q = new ArrayDeque<>();

         int l = 0 , r = 0;

       for(int i =0 ; i < n ; i++)
         {
            while(q.size() > 0  && q.peekFirst()  <= i-k)
            {
               q.pollFirst();
            }
         
          while(q.size() > 0  &&  nums[q.peekLast()] < nums[i])
          {
            q.pollLast();
          }

          q.offerLast(i);

          if(i >= k -1)
          {
            output[i-k+1] = nums[q.peekFirst()];
          }
         }

         return output;
    }
}
