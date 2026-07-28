import java.util.ArrayList;
import java.util.Arrays;

public class RotateByKOptimal {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k=k%n;
//reverse(nums,0,n-k-1);
//reverse(nums,n-k,n-1);
//reverse(nums,0,n-1);     // rotate right by k
        reverse(nums, 0, k - 1);

        // Step 2: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }
    public void reverse(int []nums, int start,int end){
while (start<= end ){
    int temp=nums[start];
    nums[start]=nums[end];
    nums[end]=temp;
    start++;
    end--;

}
    }

    public static void main(String[] args) {
        RotateByKOptimal r=new RotateByKOptimal();
        int []nums={1,2,3,4,5,6,7};
        r.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
}

