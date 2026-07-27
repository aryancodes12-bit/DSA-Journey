import java.util.Arrays;

public class SecondLargest {
    long first = 0;
    long second = 0;

    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1;
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                return nums[i];
            }
        }
        return -1;
    }
    public int secondSmallestElement(int[] nums) {
        if (nums.length < 2) return -1;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int n :nums){
            if(n !=smallest){
                secondSmallest=smallest;
                smallest=n;
            } else if (n<secondSmallest) {
                secondSmallest=n;

            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        SecondLargest s=new SecondLargest();
        int [] nums= {7, 7, 2, 2, 10, 10, 10};
        System.out.println(s.secondLargestElement(nums));
        System.out.println(s.secondSmallestElement(nums));
    }
}
