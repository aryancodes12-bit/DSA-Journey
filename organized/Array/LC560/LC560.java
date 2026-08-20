import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
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
    }
}