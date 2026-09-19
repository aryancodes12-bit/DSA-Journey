public class MinimumDayNeedToMakeMbouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // Not enough flowers to make m bouquets
        if ((long) m * k > n) {
            return -1;
        }

        int max = 0;

        for (int day : bloomDay) {
            max = Math.max(max, day);
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int consecutive = 0;

            // Check how many bouquets can be made by 'mid' days
            for (int day : bloomDay) {

                if (day <= mid) {
                    consecutive++;

                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                }
                else {
                    consecutive = 0;
                }
            }

            // Enough bouquets → try fewer days
            if (bouquets >= m) {
                high = mid - 1;
            }
            // Not enough bouquets → need more days
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
