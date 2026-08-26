package Leetcode.Arrays;

public class SubarraySumEqualsK {
    public int subarraySum(int[] arr, int k) {
//        // Size of the array
//        int n = arr.length;
//
//        // Initialize count of subarrays
//        int count = 0;
//
//        // Traverse all possible start indices
//        for (int i = 0; i < n; i++) {
//            // Traverse all possible end indices from start
//            for (int j = i; j < n; j++) {
//                // Initialize sum for current subarray
//                int sum = 0;
//
//                // Calculate sum of subarray from i to j
//                for (int m = i; m <= j; m++) {
//                    sum += arr[m];
//                }
//
//                // If sum equals k, increment count
//                if (sum == k) {
//                    count++;
//                }
//            }
//        }
//
//        // Return total count of subarrays
//        return count;
//    }
//}
        /*
          int n =nums.length; int s=0; int cnt=0;
       Map<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
       for (int i=0;i<n;i++){
        s+=nums[i];

 int prefix=s-k;
 if(h.containsKey(prefix)){
    cnt+=h.get(prefix);
 }
h.put(s,h.getOrDefault(s,0)+1);
       }
       return cnt;
         */
        
}
