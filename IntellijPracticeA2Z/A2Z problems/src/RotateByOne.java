import java.util.Arrays;

public class RotateByOne {
    public void rotateArrayByOne(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        int temp = nums[0];

        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }

        nums[n - 1] = temp;
    }

    public static void main(String[] args) {
        RotateByOne r = new RotateByOne();
        int[] nums = {1, 2, 3, 4, 5};

        r.rotateArrayByOne(nums);

        // Print the rotated array
        System.out.println(Arrays.toString(nums));
    }
}