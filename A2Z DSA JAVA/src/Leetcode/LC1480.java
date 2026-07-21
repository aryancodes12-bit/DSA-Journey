package Leetcode;

public class LC1480 {
    public int[] runningSum(int[] nums) {
int n = nums.length;
        int[] ans = new int[n];
for (int i=0;i<n ;i++){

  ans[i]=ans[i-1]+nums[i];
}
        return ans ;
    }

}
