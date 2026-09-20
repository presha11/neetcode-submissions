class Solution {
    public int characterReplacement(String s, int k) {
        
        int len = 0 ;

       for(int i = 0 ; i < s.length(); i++)
 
       {Map<Character , Integer > map = new HashMap<>();
       int maxFreq =0;
          for(int j  = i ; j < s.length() ; j++)
          {

           map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

           if(map.get(s.charAt(j)) > maxFreq)
           {

            maxFreq = map.get(s.charAt(j));
           }

           if(j-i+1 - maxFreq <=k)
           {
            len = Math.max(len , j-i+1);
           }

          }
       }

       return len;
    }
}
