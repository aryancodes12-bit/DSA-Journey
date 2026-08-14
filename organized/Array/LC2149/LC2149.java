class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] fin = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
               fin[posIndex] =nums[i];
                posIndex+=2;
            } else {
               fin[negIndex]=nums[i];
                negIndex+=2;
            }
        }

        return fin;
      
    }
}