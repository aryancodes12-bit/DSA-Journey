package Leetcode.Arrays;

public class LC1752 {
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
    }

    public static void main(String[] args) {
        LC1752 l = new LC1752();
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(l.check(arr)); // Output: true
    }
}