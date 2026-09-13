package MissingAndRepeating;

public class better {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int [] hash=new int[n+1];
        for(int i =0;i<n ;i++){
            hash[nums[i]]++;
        }
        int missing=-1;
        int repeating=-1;
        // Find the repeating and missing number:
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }

            // Stop early if both found
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        // Return [repeating, missing]
        return new int[]{repeating, missing};
    }
}
