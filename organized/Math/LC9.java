public class Solution {
    public boolean isPalindrome(int x) {
        // Edge cases: Negative numbers & numbers ending in 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int lastDigit = x % 10;           // Extract last digit
            reversed = reversed * 10 + lastDigit; // Build reversed number
            x /= 10;                          // Remove last digit
        }

        return original == reversed;
    }
}