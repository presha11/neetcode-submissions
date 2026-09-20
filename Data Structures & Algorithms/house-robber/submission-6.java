class Solution {
    public int rob(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        return dfs(nums , 0,map);
    }


    public int dfs(int[] nums ,int i, Map<Integer,Integer> map)
    {

        if( i >=nums.length)
        return 0;
         if(map.containsKey(i))
         return map.get(i);

        int result = Math.max(nums[i] + dfs(nums,i+2,map), dfs(nums,i+1,map));
        map.put(i , result);
        return result;
    }
}
