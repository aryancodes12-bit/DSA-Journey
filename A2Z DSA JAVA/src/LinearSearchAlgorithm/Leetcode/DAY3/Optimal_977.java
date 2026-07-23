package LinearSearchAlgorithm.Leetcode.DAY3;

public class Optimal_977 {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            int left = 0;
            int right = n - 1;

            // Final array ko piche se bharte hue aayenge (bada element pehle)
            for (int i = n - 1; i >= 0; i--) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                // Jo square bada ho, use piche place kar do
                if (leftSquare > rightSquare) {
                    result[i] = leftSquare;
                    left++; // Left pointer aage badhao
                } else {
                    result[i] = rightSquare;
                    right--; // Right pointer peeche lao
                }
            }

            return result;
        }
    }
}
