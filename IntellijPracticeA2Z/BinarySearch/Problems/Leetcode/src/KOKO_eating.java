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

}
