public class KOKO_eating {
    //Brute force
    /*
    import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
              max=Math.max(max,piles[i]);
        }
        for(int k=1;k<=max;k++){
             long hour=0;
            for(int pile:piles){
           hour+=(pile+k-1)/k;
        }
        if(hour<=h){
            return  k;
        }
        }
    return -1;
    }
}
     */
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = HourCount(piles, mid);

            if (hours <= h) {
                high = mid - 1; // valid → try smaller speed
            } else {
                low = mid + 1; // too slow → increase speed
            }
        }

        return low;
    }
    long HourCount(int[] piles, int mid) {

        long hours = 0;

        for (int pile : piles) {
            hours += ((long) pile + mid - 1) / mid;
        }

        return hours;
    }
}
