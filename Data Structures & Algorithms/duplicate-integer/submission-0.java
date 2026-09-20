class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer>  map = new HashMap<>();

        for(int i : nums)
        {
            if(map.get(i) !=null)
            return true;
            else
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return false;
    }
}