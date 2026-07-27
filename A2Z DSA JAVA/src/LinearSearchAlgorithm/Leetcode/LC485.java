package LinearSearchAlgorithm.Leetcode;

public class LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {
        LC485 lc=new LC485();
        int [] nums={1,1,1,0,0,1,1};
        int ans=lc.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}
