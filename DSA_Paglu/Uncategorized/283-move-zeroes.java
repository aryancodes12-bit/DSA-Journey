/*
Problem   : 283. Move Zeroes
Difficulty: Easy
Topics    : N/A
Link      : https://leetcode.com/problems/move-zeroes">283.
Time      : O(?)
Space     : O(?)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
    }
}