import java.util.Arrays;
import java.util.ArrayList;

public class RotateByKBrute {

    public void rotateArray(int[] nums,int k ) {
        int n =nums.length;
        k= k%n;
        ArrayList<Integer> A=new ArrayList<>();
        for (int i=0;i<k;i++){
            A.add(nums[i]);
        }
      for (int i=k;i<n;i++){
          nums[i-k]=nums[i];
      }
      for (int i=n-k;i<n;i++){
          nums[i]=A.get(i-(n-k));
      }
    }

    public static void main(String[] args) {
        RotateByKBrute r=new RotateByKBrute();
        int []nums={1,2,3,4,5,6,7};
       r.rotateArray(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
