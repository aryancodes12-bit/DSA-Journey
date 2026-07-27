    package LinearSearchAlgorithm.Leetcode.DAY3;

    import java.util.Arrays;

    public class LC977 {
        public int[] sortedSquares(int[] nums) {
    int [] arr=new int[nums.length];
    for (int i =0;i<nums.length;i++){
    arr[i]=nums[i]*nums[i];

    } Arrays.sort(arr);
            return arr;
        }
        public static void main(String[] args) {
            LC977 lc=new LC977();
            int [] nums={-4,-1,0,3,10};
            System.out.println(Arrays.toString(lc.sortedSquares(nums)));

        }
    }
