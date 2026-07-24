import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = map.get(s.charAt(i));

            // If a smaller value precedes a larger value, subtract it
            if (i < n - 1 && currentVal < map.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }
}