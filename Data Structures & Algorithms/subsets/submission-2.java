class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> arr = new ArrayList<>();

        findSubsets(nums , 0 , result ,arr);
        return result;
    }


    public void findSubsets(int[] nums , int i , List<List<Integer>> result , List<Integer> arr)
    {

        if(i>=nums.length)

       {result.add(new ArrayList<>(arr));
        return;}

        arr.add(nums[i]);
        findSubsets(nums,i+1 , result , arr);
        arr.remove(arr.size() -1 );
        findSubsets(nums , i+1 , result, arr);
    }
}
