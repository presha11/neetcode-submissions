class Solution {
    public int characterReplacement(String s, int k) {
        
        int len = 0 ;

        for(int  i = 0 ; i < s.length() ; i++)
        {  int maxFreq = 0;
          Map<Character , Integer> freq = new HashMap<>();
          for(int j = i ; j< s.length() ; j++)
          {
            freq.put(s.charAt(j),
         freq.getOrDefault(s.charAt(j), 0) + 1);
            maxFreq= Math.max(maxFreq , freq.get(s.charAt(j)));
            if( (j-i+1) - maxFreq >k)
            {
              break;
            }

            else
            {len = Math.max(len , j-i+1);}

            
          }
        }

        return len;
    }
}
