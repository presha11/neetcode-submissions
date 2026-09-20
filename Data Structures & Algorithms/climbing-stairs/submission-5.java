class Solution {
    public int climbStairs(int n) {
        
      Map<Integer, Integer> map = new HashMap<>();
      return   findSteps(n,map);
    }

    public int findSteps(int n, Map<Integer, Integer> map)
    {
        if(n<=0)
        return n==0 ? 1 : 0;
        if(map.containsKey(n))
        {return map.get(n);}
      
      int result =  findSteps(n-1,map)+ findSteps(n-2,map);
      map.put(n,result);
      return result;

    }
}
