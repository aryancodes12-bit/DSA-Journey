import java.util.*;
public class ArrayRotationCount {
    public int findKRotation(ArrayList<Integer> nums) {
        int n = nums.size();
        int low = 0;
        int high = n - 1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(nums.get(mid) > nums.get(high)){   // right one

                low = mid + 1;
            }

            else{
                high=mid;
            }
        }
        return low;
    }
}
