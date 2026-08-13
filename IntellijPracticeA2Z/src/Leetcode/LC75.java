package Leetcode;

public class LC75 {
    public void sortColors(int[] nums) {
  int count1=0; int count2=0; int count3= 0;
  int n =nums.length;
  for (int i =0;i<n ;i++) {
      if (nums[i]==0){
          count1++;
      } else if (nums[i]==1) {
          count2++;
      }
      else{
          count3++;
      }

  }
        for (int i=0; i<count1;i++){
   nums[i]=0;
        }
        for (int i = count1; i <count1+count2 ; i++) {
            nums[i]=1;
        }
        for (int i = count1+count2; i <n ; i++) {
            nums[i]=2;
        }
    }

    public static void main(String[] args) {
        LC75 l=new LC75();
        int [] nums={2,0,2,1,1,0};
        l.sortColors(nums);
    }
}
