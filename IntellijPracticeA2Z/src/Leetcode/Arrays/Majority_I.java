package Leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Majority_I {
    public int majorityElement(int[] nums) {
        // brute force
        int n = nums.length;
//       for(int i=0;i<n;i++){
//           int count=0;
//           for (int j = 0; j <n ; j++) {
//             if(nums[j]==nums[i]){
//                 count++;
//             }
//           }
//           if(count>(n/2)){
//               return nums[i];
//           }
//        }
//       return -1;
//    }
        // BETTER SOLN
//        Map<Integer, Integer> mpp = new HashMap<>();
//        for (int e : nums) {
//         int count= mpp.getOrDefault(e,0)+1;
//         mpp.put(e,count);
//       if (count>n/2){
//           return e;
//        }
//
//        }
//        return -1;



        //optimal

            int el = 0; int cnt=0;
            for (int i = 0; i <n ; i++) {
                if(cnt==0){
                    el=nums[i];
                    cnt=1;
                } else if (nums[i]==el) {
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
            int cnt1=0;
            for (int i = 0; i < n; i++) {
                if(nums[i]==el){
                    cnt1++;
                }
            } if (cnt1 > n/2) {
                return el ;
            }

            return -1;
        }
}
