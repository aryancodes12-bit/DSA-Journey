public class LargestElement {
    int max=Integer.MIN_VALUE;
    public int largestElement(int[] nums) {
  for ( int i =0;i<nums.length;i++){
 if(nums[i]>max){
     max=nums[i];
 }
  }
        return max;
    }

    public static void main(String[] args) {
        LargestElement l=new LargestElement();
        int [] nums={-4,5,9,-45};
        System.out.println(l.largestElement(nums));;
    }
}
