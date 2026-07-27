package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LC26 {
//    public int removeDuplicates(int[] nums) {
//        Arrays.sort(nums);
//        HashSet<Integer> h=new HashSet<>();
//        for (int n :nums){
//            h.add(n);
//        }
//
//        int index=0;
//        for (int num:h){
//            nums[index++]=num;
//        }
//        return h.size();
//    }
    public int removeDuplicates(int[] nums) {
  int i=0;
  for(int j =0;j< nums.length;j++){
      if(nums[i]!=nums[j]){
          nums[i+1]=nums[j];
          i++;
      }
  }
return i+1;
    }
    public static void main(String[] args) {
        LC26 l =new LC26();
        int [] nums={1,1,2};
        System.out.println(l.removeDuplicates(nums));
    }
}
