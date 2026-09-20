class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q= new ArrayDeque<>();
           int n = nums.length;
        int[] result = new int[n-k+1];
  
        for(int i  = 0 ; i< n ; i++)
        {

         while(q.size() >0  && q.peekFirst() <= i-k)
         {
            q.pollFirst();
         }

          while(q.size() >0  && nums[q.peekLast()] <= nums[i])
         {
            q.pollLast();
         }

         q.offerLast(i);

         if(i >= k-1)
         {
            result[i-k+1] = nums[q.peekFirst()]; 
         }

        }
        return result;
    }
}
