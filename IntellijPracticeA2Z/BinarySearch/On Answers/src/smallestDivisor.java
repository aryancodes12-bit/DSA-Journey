public class smallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;

        for (int num: nums) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long running = HourCount(nums, mid);

            if (running <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    long HourCount(int[] nums, int mid) {

        long sum = 0;

        for (int num : nums) {
            sum += ((long) num + mid - 1) / mid;
        }

        return sum;
    }
}
