class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0 ;

        for(int i = 0 ; i < s.length() ;  i++)
        {
            Set<Character> charset = new HashSet<>();

            for(int j = i ; j < s.length() ; j++)
            {
                if(charset.contains(s.charAt(j)))
                {
                    break;
                }
                else
                {
                    charset.add(s.charAt(j));
                }
            }

                len = Math.max(len , charset.size());

            }
            return len;
        
    }
}
