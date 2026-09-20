public class Solution {
    public String minWindow(String s, String t) {
        if (t == null || t.isEmpty()) return "";
        if (s == null || s.length() < t.length()) return "";

        // ASCII size; you could tune to 128 for standard ASCII
        int[] need = new int[128];
        int[] window = new int[128];

        int needDistinct = 0; // number of distinct chars needed
        for (char c : t.toCharArray()) {
            if (need[c] == 0) needDistinct++;
            need[c]++;
        }

        int have = 0;
        int left = 0;
        int bestL = -1, bestR = -1;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;

            // If this character is required and we've hit its required count
            if (need[c] > 0 && window[c] == need[c]) {
                have++;
            }

            // Try to shrink while we still satisfy the window
            while (have == needDistinct) {
                int curLen = right - left + 1;
                if (curLen < bestLen) {
                    bestLen = curLen;
                    bestL = left;
                    bestR = right;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;
                if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                    have--;
                }
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestR + 1);
    }
}
