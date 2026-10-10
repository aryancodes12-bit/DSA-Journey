import java.util.Map;

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int max = 0;
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                max = Math.max(max, freq[s.charAt(j) - 'a']);
                int min = Integer.MAX_VALUE;
                for (int f : freq) {

                    if (f > 0 && f < min) {

                        min = f;

                    }

                }
                total += (max - min);
            }
        }
        return total;
    }
}