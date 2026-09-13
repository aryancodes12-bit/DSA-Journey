package CountInversions;

public class brute {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j] && i < j) {
                    cnt++;
                }

            }
        }
return cnt;
    }
}
