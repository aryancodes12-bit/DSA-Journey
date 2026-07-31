import java.lang.reflect.Array;
import java.util.ArrayList;

public class LC136 {
    public int singleNumber(int[] nums) {
        // optimal
//        int result=0;
//        for (int i =0;i<nums.length;i++){
//           result^=nums[i];
//        }
//        return result;

        // brute force
        int max=nums[0];
for (int i=0;i<nums.length;i++){
    max=Math.max(max,nums[i]);
}
int []hash =new int[max+1];
for (int i=0;i<nums.length;i++){
    hash[nums[i]]++;
}
for (int i=0;i< nums.length;i++){
    if(hash[nums[i]]==1){
        return i;
    }
}
return -1;
    }
}
