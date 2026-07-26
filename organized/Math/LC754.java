class Solution {
  public int reachNumber(int target) {
        // Target can be negative; distance is the same
        target = Math.abs(target);
        
        int sum = 0;
        int step = 0;

        // Keep stepping forward until sum >= target
        while (sum < target) {
            step++;
            sum += step;
        }

        // If the difference is odd, keep adding steps until difference is even
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }

        return step;
    }
}