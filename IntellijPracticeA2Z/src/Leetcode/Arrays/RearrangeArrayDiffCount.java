package Leetcode.Arrays;

public class RearrangeArrayDiffCount {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int[] fin = new int[n];
        int posIndex = 0;
        int negIndex = 0;
        int posCnt = 0;
        int negCnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[posIndex] = nums[i];
                posCnt++;
            } else {
                neg[negIndex] = nums[i];
                negCnt++;
            }
        }

            int k=0;
           while(posIndex<posCnt && negIndex<negCnt){

        }
        return fin;
    }
}