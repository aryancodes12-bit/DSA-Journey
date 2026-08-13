import java.util.Arrays;

public class TwoSum {
    public String twoSum(int[] nums, int target) {
        int n = nums.length;
// Brute Force
//        for (int i = 0; i < n; i++) {
//            // Start j from i + 1 to check only unique forward pairs
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    System.out.println("Found: " + nums[i] + " + " + nums[j] + " = " + target);
//                    return true;
//                }
//            }
//        }
//        System.out.println("No pair found.");
//        return false;


        //BETTER
//        Map<Integer,Integer> m = new HashMap<>();
//        for (int i = 0; i <n ; i++) {
//            int complement= target-nums[i];
//            if (m.containsKey(complement)){
//                return new int [] {
//                m.get(complement),i
//                };
//            }
//            m.put(nums[i],i);
//        }
//        return new int [] {};

        //OPTIMAL
        int left=0; int right=n-1;
        Arrays.sort(nums);
        while (left< right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return "YES";
            } else if (sum<target) {
                left++;
            }
            else right--;
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSum t = new TwoSum();
        System.out.println((t.twoSum(nums, 9)));
    }
}