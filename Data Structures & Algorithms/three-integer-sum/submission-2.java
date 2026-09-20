class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++)
        {    
           
      
            int target = 0 -(nums[i]);
if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1 ; int k = nums.length -1 ;

            while(j<k)
            {
                int sum = nums[j] + nums[k];

                if(sum == target)
                {
                   list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // ✅ Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
  // ✅ Skip duplicate j
                    
               else if(sum > target )
                {
                    k--;
                }

                else
                {j++;}
            }
        }

        return list;
    }
}
