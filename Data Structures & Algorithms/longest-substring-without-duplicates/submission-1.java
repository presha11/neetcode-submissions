class Solution {
    public int lengthOfLongestSubstring(String s) {
  Set<Character> charset = new HashSet<>();
  int i = 0 ; 
 
     int res = 0;
    for(int r = 0 ; r <s.length() ; r++)
    {
        while(charset.contains(s.charAt(r)))
        {
            charset.remove(s.charAt(i));
            i++;
        }
        charset.add(s.charAt(r));
        res = Math.max(res, r - i + 1);
    }
return res;
}
}
