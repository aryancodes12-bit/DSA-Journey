package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LC283_MOVEZEROS {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> A=new ArrayList<>();
        for (int i=0;i<n;i++) {
            if (nums[i] != 0) {
                A.add(nums[i]);
            }
        }
        for (int i =0;i<A.size();i++){
            nums[i]=A.get(i);
        }
        for (int i=A.size();i< n;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        LC283_MOVEZEROS l=new LC283_MOVEZEROS();
        int [] nums={1,0,1,3,12};
        l.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}