package Leetcode.Arrays;

public class NextPermutationOptimal {
    public void nextPermutation(int[] nums) {
int n = nums.length;
int ind=-1;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            rev(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        rev(nums,ind+1,n-1);
    }
    void rev(int [] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    void swap(int [] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        NextPermutationOptimal n=new NextPermutationOptimal();
        int [] nums={2,1,5,4,3,0,0};
        n.nextPermutation(nums);
    }
}
