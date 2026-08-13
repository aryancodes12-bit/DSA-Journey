import java.util.Arrays; // Don't forget to import this at the top!

public class DNF {
    public void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int low = 0; int mid = 0; int high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        DNF d = new DNF();
        d.sortZeroOneTwo(nums);

        // PRINT THE ARRAY HERE:
        System.out.println(Arrays.toString(nums));
    }
}