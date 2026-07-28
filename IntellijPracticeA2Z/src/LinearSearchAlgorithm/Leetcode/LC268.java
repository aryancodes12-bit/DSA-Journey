package LinearSearchAlgorithm.Leetcode;


public class LC268 {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int expectedSum=n*(n+1)/2;
        int actual=0;
        for (int i = 0; i < nums.length; i++) {
        actual+=nums[i];
                }
        return expectedSum-actual;
            }
    public static void main(String[] args) {
        LC268 solver = new LC268();
        int[] nums = {3, 0, 1};
        System.out.println("Missing Number: " + solver.missingNumber(nums)); // Output: 2
    }
}



