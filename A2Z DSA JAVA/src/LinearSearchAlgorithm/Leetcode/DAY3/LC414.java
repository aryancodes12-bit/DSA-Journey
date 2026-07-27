package LinearSearchAlgorithm.Leetcode.DAY3;

public class LC414 {
    public int thirdMax(int[] nums) {
Long first =null;
Long second=null;
Long third=null;
for (Integer num:nums){
    if(num.equals(first) || num.equals(second) || num.equals(third)){
continue;
    }
    if (first == null || num > first) {
        third = second;
        second = first;
        first = (long) num;
    } else if (second == null || num > second) {
        third = second;
        second = (long) num;
    } else if (third == null || num > third) {
        third = (long) num;
    }
}

        return third == null ? first.intValue() : third.intValue();
    }


    public static void main(String[] args) {
        LC414 l=new LC414();
        int [] nums={3,2,1};
        System.out.println( l.thirdMax(nums));;
    }
}
