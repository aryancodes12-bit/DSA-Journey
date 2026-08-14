package Leetcode.Arrays;

import java.util.Arrays;

public class KadaneAlgo {
    public int maxSubArray(int[] nums) {

        // BETTER
//        int n = nums.length; int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//
//            for (int j = i; j < n; j++) {
//                sum += nums[j];
//
//                if (sum>max) {
//                    max = sum;
//                }
//
//            }
//
//        }
//        return max;


        // OPTIMAL
        int max = Integer.MIN_VALUE;
        int n = nums.length;   int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }


        }  return max;
    }
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        KadaneAlgo k=new KadaneAlgo();
        System.out.println(k.maxSubArray(nums));


    }
}
