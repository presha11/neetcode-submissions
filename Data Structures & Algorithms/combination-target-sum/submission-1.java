class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> subset = new ArrayList<>();

        findSum(nums , 0 , target , result , subset);

        return result;
    }


    public void findSum(int[] nums , int i , int target , List<List<Integer>> result , List<Integer> subset)
    {

      if(target ==0)
      {
        result.add(new ArrayList<>(subset));
        return ;
      }
      else if(target < 0 || i >= nums.length)
      {
        return;
      }

      subset.add(nums[i]);
      findSum(nums , i , target - nums[i], result , subset);
      subset.remove(subset.size() - 1);
      findSum( nums , i+1, target , result , subset);

    }
}
