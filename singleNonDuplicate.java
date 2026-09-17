public class singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0; int high=n-1;
        while(low<high){
            int mid= low+(high-low)/2;
            if(mid%2!=0){
                mid-=1;
            }

            if(nums[mid]==nums[mid+1]){
                //search space is on right
                low=mid+2;
            }
            else{
                // its on the left of mid or mid itself
                high=mid;
            }

        }
        return nums[low];
    }
}
