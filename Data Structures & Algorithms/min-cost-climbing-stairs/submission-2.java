class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer,Integer> map = new HashMap<>();
      return   Math.min(dfs(cost.length-1 ,  cost,map),dfs(cost.length-2 , cost,map));

    }
   
   public int dfs(int n ,int[] cost,Map<Integer,Integer> map)
   {
    if(n<0)
    return 0;
    if(map.containsKey(n))
    return map.get(n);
    int result = cost[n] +Math.min(dfs(n-1 , cost,map), dfs(n-2 , cost,map));
    map.put(n,result);
    return result;
   }


}
