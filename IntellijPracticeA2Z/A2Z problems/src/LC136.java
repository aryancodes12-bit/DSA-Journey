import java.lang.reflect.Array;
import java.util.ArrayList;

public class LC136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i =0;i<nums.length;i++){
           result^=nums[i];
        }
        return result;
    }
}
