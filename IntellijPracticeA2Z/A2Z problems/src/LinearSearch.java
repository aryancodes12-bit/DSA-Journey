public class LinearSearch {
    public int linearSearch(int nums[], int target) {
        for ( int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch l=new LinearSearch();
        int [] nums={2, 3, 4, 5, 3};

        System.out.println(l.linearSearch(nums,4));
    }
}
