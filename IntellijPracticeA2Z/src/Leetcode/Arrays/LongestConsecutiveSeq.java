package Leetcode.Arrays;
import java.util.*;
import javax.sound.sampled.Line;
public class LongestConsecutiveSeq {
    // BRUTE FORCE
//    boolean LinearSearch(int [] a , int nums){
//        int n =a.length;
//        for(int i=0;i<n ;i++){
//            if(a[i]==nums){
//                return true;
//            }
//        }
//        return false;
//    }
//    public int longestConsecutive(int[] nums) {
//if(nums.length==0){
//    return 0;
//}
//int n =nums.length;
//int longest=1;
//        for (int i=0;i<n;i++){
//            int x=nums[i];
//            int maxCnt=1;
//            while (LinearSearch(nums,x+1)){
//                x+=1;
//                maxCnt+=1;
//            }
//            longest=Math.max(longest,maxCnt);
//        }
//        return longest;
//    }


    // BETTER
    /*
    import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
      int n =nums.length;
      Arrays.sort(nums);
       int lastseen=Integer.MAX_VALUE; int longest=1;
      int cnt=0;
      if(n==0){
        return 0;
      }
      for(int i=0;i<n;i++){

        if(nums[i]-1==lastseen){
            lastseen=nums[i];
            cnt++;
        }
        else if(nums[i]!=lastseen){
            cnt=1;
            lastseen=nums[i];
        }
        longest=Math.max(longest,cnt);
      }
      return longest;
    }
}
    */

    //OPTIMAL

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int e:nums){
            set.add(e);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int x=num;
                int cnt=1;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                 longest=Math.max(longest,cnt);
            }

        }
        return longest;
    }
}
