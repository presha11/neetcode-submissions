class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty())
        return "";

        Map<Character , Integer> mapT = new HashMap<>();
        Map<Character , Integer> mapS = new HashMap<>();

        for(char ch : t.toCharArray())
        {

            mapT.put(ch, mapT.getOrDefault(ch,0)+1);

        }

        int have = 0 , need = mapT.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        int l = 0 ;

        for(int  r = 0 ; r < s.length() ; r++)
        {
 char c = s.charAt(r);
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);


         if(mapT.containsKey(c) && mapS.get(c).equals(mapT.get(c)))
         {have++;        
        }


        while(have == need)
        {

            if((r-l+1) < resLen)
            {

                resLen = r - l +1;
                res[0] =  l;
                res[1] = r;
            }

            char ch = s.charAt(l);
              mapS.put(ch, mapS.get(ch) - 1);
   if (mapT.containsKey(ch) && mapS.get(ch) < mapT.get(ch)) {
                    have--;
                }
                l++;

        }
    }

 return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}
