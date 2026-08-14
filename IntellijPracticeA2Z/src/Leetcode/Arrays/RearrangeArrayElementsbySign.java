package Leetcode.Arrays;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        // BRUTE
//        int[] pos = new int[n / 2];
//        int[] neg = new int[n / 2];
//        int[] fin = new int[n];
//        int posIndex = 0;
//        int negIndex = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                pos[posIndex] = nums[i];
//                posIndex++;
//            } else {
//                neg[negIndex] = nums[i];
//                negIndex++;
//            }
//        }
//        for (int i = 0; i < n/2; i++) {
//            fin[2 * i] = pos[i];
//            fin[(2*i) + 1] = neg[i];
//        }
//        return fin;

        // OPTIMAL APPROACH
        int[] fin = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
               fin[posIndex] =nums[i];
                posIndex+=2;
            } else {
               fin[negIndex]=nums[i];
                negIndex+=2;
            }
        }

        return fin;
    }

    public static void main(String[] args) {
        RearrangeArrayElementsbySign r =new RearrangeArrayElementsbySign();
        int [] nums={2, 4, 5, -1, -3, -4};
        System.out.println(Arrays.toString(r.rearrangeArray(nums)));
    }
}