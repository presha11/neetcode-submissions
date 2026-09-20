class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        int[] freq = new int[nums.length];

        dfs(nums , arr , freq , result);

        return result;
    }

    public void dfs(int[] nums , List<Integer> arr , int[] freq , List<List<Integer>> result )
    {
        if(arr.size() == nums.length)
        {
            result.add(new ArrayList<>(arr));
            return;
        }

        for(int i = 0 ; i <nums.length ; i ++)
        {
            if(freq[i]==0)
            {
                arr.add(nums[i]);
                freq[i] = 1;
                dfs(nums , arr , freq , result);
                arr.remove(arr.size() -1);
                freq[i] = 0;
            }
        }
    }
}
