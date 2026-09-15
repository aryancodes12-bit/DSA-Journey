public class FloorAndCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int floor = -1;
        int ceil=-1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = n - 1;
        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            if (nums[mid1] >= x) {ceil= mid1;
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }

        }
        return new int[] {floor,ceil};
        }

    }

