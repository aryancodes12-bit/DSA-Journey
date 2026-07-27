package LinearSearchAlgorithm.Leetcode;
import java.util.Arrays;
public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
        if (nums[i]==nums[i+1]){
            return true;
        }
        }
        return false;
    }

    public static void main(String[] args) {
        LC217 lc =new LC217();
        int [] nums= {1,2,3,1};

        System.out.println(  lc.containsDuplicate(nums));;

    }
}
// another approach using hashSet