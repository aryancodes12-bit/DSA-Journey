/*
Problem   : 268. Missing Number
Difficulty: Easy
Topics    : N/A
Link      : https://leetcode.com/problems/missing-number">268.
Time      : O(?)
Space     : O(?)
*/

class Solution {
        public int missingNumber(int[] nums) {
        int n =nums.length;
        int expectedSum=n*(n+1)/2;
        int actual=0;
        for (int i = 0; i < nums.length; i++) {
        actual+=nums[i];
                }
        return expectedSum-actual;
            }
}