package Leetcode;

import java.util.Arrays;

class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]= new int[nums.length] ;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int []nums={1,8,0,5,6,9};
       int ans[]=s.buildArray(nums);
        System.out.println(ans);
    }
}

