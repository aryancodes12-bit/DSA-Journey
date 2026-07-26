class Solution {
   public boolean check(int[] nums) {
        int x = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element directly in nums
            // (i + 1) % n automatically compares nums[n-1] with nums[0] at the end
            if (nums[i] > nums[(i + 1) % n]) {
                x++;
            }
        }

        return x <= 1;
}}