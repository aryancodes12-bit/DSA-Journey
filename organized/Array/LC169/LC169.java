import java.util.HashMap;
import java.util.Map;
class Solution {
    public int majorityElement(int[] nums) {
          Map<Integer, Integer> mpp = new HashMap<>();
        for (int e : nums) {
            mpp.put(e, mpp.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : mpp.entrySet()) {
            if (e.getValue() > nums.length/2 ) {
                return e.getKey();
            }
        }
        return -1;
    }
}