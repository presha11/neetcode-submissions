class Solution {
    public int numDecodings(String s) {
        Map<Integer , Integer> map  = new HashMap<>();
        map.put(s.length(),1);
        return dfs(s,0, map);
    }

    public int dfs(String str , int i , Map<Integer , Integer> map)
    {
        if(map.containsKey(i))
        {
            return map.get(i);
        }

        if(str.charAt(i)=='0')
        {
            return  0;
        }

        int res = dfs(str , i+1,map);
        if(i < str.length() -1)
        {
            if(str.charAt(i)=='1' || (str.charAt(i)=='2') && str.charAt(i+1) <'7')
            {
                res+=dfs(  str,i+2,map);
            }
        }
    map.put( i , res);
        return res;


    }
}
