class Solution {
   public int thirdMax(int[] nums) {
        // Use Long to handle Integer.MIN_VALUE in the input array
        Long max1 = null;
        Long max2 = null;
        Long max3 = null;

        for (int num : nums) {
            // Convert to Long for safe comparison with null/Long values
            long n = num;

            // Skip duplicates
            if ((max1 != null && n == max1) || 
                (max2 != null && n == max2) || 
                (max3 != null && n == max3)) {
                continue;
            }

            // Update top 3 maximums
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }

        // If third max doesn't exist, return max1
        return max3 == null ? max1.intValue() : max3.intValue();
    }
}