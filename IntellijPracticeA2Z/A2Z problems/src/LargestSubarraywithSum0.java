import java.util.*;
public class LargestSubarraywithSum0 {
    public int maxLen(int[] arr) {
        // BETTER
      /*  int n =arr.length;   int s=0; int max=0;
        for (int i = 0; i < n; i++) {
            for(int j=i;j<n;j++){
                s+=arr[j];

            if(s==0){
                max=Math.max(max,j-i+1);
            }
            }
        }
        return max;

       */
        //OPTIMAL



         HashMap<Integer, Integer> map = new HashMap<>();
         int Prefix=0; int max=0;
for (int i=0;i<arr.length;i++){
    Prefix+=arr[i];
    if(Prefix==0){
        max++;
    }


if(map.containsKey(Prefix)){
max=Math.max(max,i-map.get(Prefix));
}
else{
    map.put(Prefix,i);
}
}
return max;
    }
}


