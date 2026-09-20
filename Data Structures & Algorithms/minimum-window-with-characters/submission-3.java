class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character , Integer > mapT = new HashMap<>();

        for(char ch : t.toCharArray())
        {
         mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        int[] res = { -1 , -1 };
        int resLen = Integer.MAX_VALUE;

        for(int i = 0 ; i < s.length() ; i++)
        {
            HashMap<Character , Integer > mapS = new HashMap<>();

            for(int j = i ; j < s.length() ; j++)
            {
               mapS.put(s.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);

               boolean flag = true;

               for(char c : mapT.keySet())
               {if (mapS.getOrDefault(c, 0) < mapT.get(c)) 
               {

                flag = false;
                break;
               }}

               if( flag && ( j-i+1) < resLen)
               {
                resLen = j-i+1;     
                res[0] = i ;
                res[1]  = j;
                
                          }
            }
        }

          return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
