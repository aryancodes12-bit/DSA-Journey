package LinearSearchAlgorithm.Leetcode.DAY3;

public class LC754 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Step 1: Calculate the total sum of all elements
        for (int num : nums) {
            totalSum += num;
        }
            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                int right = totalSum - leftSum - nums[i];
                if (leftSum == right) {
                    return i;
                }
                leftSum += nums[i];
            }

         return -1;
    }
    public static void main(String[] args) {
        LC754 l=new LC754();
        int []  nums={1,7,3,6,5,6};
     int sol=l.pivotIndex(nums);
        System.out.println(sol);}
}
