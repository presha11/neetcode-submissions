class Solution {
     List<List<Integer>> res ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
     res =    new ArrayList<List<Integer>>();
      List<Integer> comb  = new ArrayList<>();

        dfs(nums , target , comb,0);
        return res;
    }

    private void dfs(int[] nums , int target , List<Integer> comb, int i)
    {
     
     if(target==0)
     {
        res.add(new ArrayList<>(comb));
        return;
     }
      if (target < 0 || i >= nums.length) {
            return;
        }
      comb.add(nums[i]);
      
        dfs(nums, target - nums[i] ,  comb ,i );
      comb.remove(comb.size()-1);
      dfs(nums , target , comb , i+1);

    }
}
