class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = HourCount(piles, mid);

            if (hours <= h) {
                high = mid - 1;       // valid → try smaller speed
            } else {
                low = mid + 1;        // too slow → increase speed
            }
        }

        return low;
    }

    long HourCount(int[] piles, int mid) {

        long hours = 0;

        for (int pile : piles) {
            hours += ((long) pile + mid - 1) / mid;
        }

        return hours;
    }
}