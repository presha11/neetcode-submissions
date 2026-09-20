class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;
        int l = 0 ; 
        int maxF = 0;
        int[] arr = new int[26];
        for(int r = 0 ; r < s.length() ;r++)
        {
           arr[s.charAt(r) - 'A']++;
          maxF = Math.max(maxF , arr[s.charAt(r)- 'A']);

          while( (r - l +1) - maxF > k)
          {
             arr[s.charAt(l) - 'A']--;
            l++;
          }
           res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
