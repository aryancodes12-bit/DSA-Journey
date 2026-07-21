package Leetcode;

import java.util.Arrays;

public class LC1929 {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
 int[] ans = Arrays.copyOf(nums,nums.length*2);

 for (int i=0;i<n;i++){
     ans[i]=nums[i];
     ans[i+n]=nums[i];
 }
        return ans;
    }

    public static void main(String[] args) {
        LC1929 l=new LC1929();
       int [] nums={1,2,3};
        System.out.println(Arrays.toString(l.getConcatenation(nums)));
    }
    }

