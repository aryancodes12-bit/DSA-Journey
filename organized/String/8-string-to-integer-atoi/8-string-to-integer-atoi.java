class Solution {
    public int myAtoi(String s) {
        //if string is null or Length is zero
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = s.length();
        //skipping whitespaces
        while (i < n && (s.charAt(i) == ' ')) {
            i++;
        }
        // if end of string is reached 
        if (i == n) {
            return 0;
        }
        //check for sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        long result = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            //s.charAt(i) - '0' this converts char to integer ascII value of 0 is 48 suppose 7-0 55-48 
            result = result * 10 + (s.charAt(i) - '0'); // printing digits 
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        return (int) (sign * result);
    }

}