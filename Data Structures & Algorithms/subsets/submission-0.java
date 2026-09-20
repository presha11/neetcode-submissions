class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        findSubset(nums , 0 , subset , res);
        return res;
    }

    private void findSubset(int[] nums , int i , List<Integer> subset , List<List<Integer>> res) {
    

    if(i>=nums.length)
    {
        res.add(new ArrayList<>(subset));

        return;
    }

    subset.add(nums[i]);
    findSubset(nums , i+ 1 , subset , res);
    subset.remove(subset.size() - 1);
    findSubset(nums , i+1 , subset , res);

}
}
