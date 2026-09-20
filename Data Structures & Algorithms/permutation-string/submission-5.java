class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character , Integer > freq1 = new HashMap<>();

        for(char ch : s1.toCharArray())
        {
            freq1.put(ch , freq1.getOrDefault(ch , 0) +1);
        }

        int need = freq1.size();

        for(int i = 0 ; i< s2.length() ; i++)
        {int cur = 0;
            Map<Character , Integer> freq2 = new HashMap<>();
             for (int j = i; j < s2.length(); j++) {

char c = s2.charAt(j);
   freq2.put(c, freq2.getOrDefault(c, 0) + 1);

   if(freq1.getOrDefault(c,0) < freq2.get(c))
   {
    break;
   }
        if (freq1.getOrDefault(c, 0) == freq2.get(c)) {
                    cur++;
                }

                if(cur == need)
                {
                    return true;
                }

        }}

        return false;
    }
}
