public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        class Solution {
            public int[][] merge(int[][] intervals) {

                // 1. Sort by starting point
                Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

                // 2. Temporary array to store answer
                int[][] temp = new int[intervals.length][2];

                int count = 0;

                // 3. Start with first interval
                int start = intervals[0][0];
                int end = intervals[0][1];

                for (int i = 1; i < intervals.length; i++) {

                    // Overlapping
                    if (intervals[i][0] <= end) {
                        end = Math.max(end, intervals[i][1]);
                    }

                    // Not overlapping
                    else {
                        temp[count][0] = start;
                        temp[count][1] = end;
                        count++;

                        start = intervals[i][0];
                        end = intervals[i][1];
                    }
                }

                // Add last interval
                temp[count][0] = start;
                temp[count][1] = end;
                count++;

                // Return only required rows
                return Arrays.copyOf(temp, count);
            }
        }
    }
}
