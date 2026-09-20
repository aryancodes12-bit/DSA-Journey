public class shipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int min = 0;
        int max = 0;
        for (int num : weights) {
            min = Math.max(min, num);
            max += num;
        }
        int low = min;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int dayCount = 1;
            int running = 0;
            for (int j : weights) {
                if (running + j > mid) {
                    dayCount++;
                    running = j;
                } else {
                    running += j;
                }
            }
            if (dayCount <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}
