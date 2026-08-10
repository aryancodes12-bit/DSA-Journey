import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayPost {
    public int longestSubarray(int[] nums, int k) {
        // BRUTE FORCE
        int n = nums.length;

//  for(int i=0;i<n ;i++){  int s=0;
//      for (int j=i;j<n;j++ ) {
//          s+=nums[j];
//          if(s==k){
//              len=Math.max(len,j-i+1);
//          }
//      }
//        }return len;

        // BETTER SOL
//        Map<Integer, Integer> h =new HashMap<>();
//        int currentSum=0;
//        int Max=0;
//        h.put(0,-1);
//
//        for (int i=0;i<n;i++){
//            currentSum+=nums[i];
//
//        int prefixSum= currentSum-k;
//        if(h.containsKey(prefixSum)){
//            int prevIndex=h.get(prefixSum);
//            int length=i-prevIndex;
//            Max=Math.max(Max,length);
//
//        }
//        if(!h.containsKey(currentSum)){
//        h.put(currentSum,i);
//        }
//        }
//        return Max;
//    }
//
//optimal
        int left = 0;
        int right = 0;
        int max = 0;
        int sum = nums[0];
while (right<n){
    while(left<=right && sum>k){
        sum-=nums[left];
        left++;
    }
    if(sum==k){
        max=Math.max(max,right-left+1);
    }
    right++;
    if(right<n){
        sum+=nums[right];
    }
}
return max;
    }
        public static void main (String[]args){
            LongestSubarrayPost l = new LongestSubarrayPost();
            int[] nums = {10, 5, 2, 7, 1, 9};
            System.out.println(l.longestSubarray(nums, 15));
        }
    }
