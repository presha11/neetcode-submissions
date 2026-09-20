class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> answer = new ArrayList<>();
Arrays.sort(nums);
        dfs(nums , 0 , result , answer);
        return result;
    }

    public void dfs(int[] nums , int ind , List<List<Integer>> result , List<Integer> ans)
    {
       
            result.add(new ArrayList<>(ans));
         
        for(int i =ind ; i <nums.length ; i++  )
        {
            if(i > ind && nums[i]==nums[i-1])
            continue;
           ans.add(nums[i]);
            dfs(nums , i+1 , result , ans);
 ans.remove(ans.size() - 1);
        }
    }
}
