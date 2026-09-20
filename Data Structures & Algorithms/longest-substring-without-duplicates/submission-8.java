class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0)
        return 0 ;
        int max  = 1 ; 

        for(int i = 0 ; i < s.length() ; i++)
        {
            StringBuilder str = new StringBuilder();
str.append(s.charAt(i));
            for(int j = i+1 ; j < s.length() ; j++)
            {
                if(str.indexOf(String.valueOf(s.charAt(j))) != -1)
               { max = Math.max(max, str.length());
                break;}
                else
               {str.append(s.charAt(j));
     max = Math.max(max, str.length());
            }}
        }
        return max;
    }
}
