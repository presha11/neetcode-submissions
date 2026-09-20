class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        int[] freq1 = new int[26];

        int n = s1.length();
        int m = s2.length();
if (n > m) return false;
        for(char ch : s1.toCharArray())
        {
            freq1[ch - 'a']++;
        }

        for(int i = 0 ; i <= m-n;i++)
        {

            int[] freq2 = new int[26];

            for(int j = i ; j < i + n ; j++)
            {
                  freq2[s2.charAt(j) - 'a']++;
            }

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
         }

         return false;
    }
}
