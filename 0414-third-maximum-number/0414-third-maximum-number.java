class Solution {
    public int thirdMax(int[] nums) {
        // Long.MIN_VALUE tracking ke liye sabse safe tarika hai
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            // Duplicate skip check (simple primitive condition)
            if (num == first || num == second || num == third) {
                continue;
            }

            // Shifting logic
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        // Agar third maximum abhi bhi MIN_VALUE hai, 
        // toh iska matlab 3 unique maximums nahi mile.
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }
}