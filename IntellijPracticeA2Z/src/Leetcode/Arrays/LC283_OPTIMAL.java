package Leetcode.Arrays;

import java.util.Arrays;

public class LC283_OPTIMAL {
    public void moveZeroes(int[] nums) {
        int n =nums.length;
        int j=-1;
        for (int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }

        }

        }
   public void swap(int []nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        LC283_OPTIMAL l= new LC283_OPTIMAL();
        int [] nums={0,1,0,3,12};
        l.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
