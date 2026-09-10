import java.util.HashMap;
import java.util.Map;

public class CountsubarrayswithgivenxorK {
    public int subarraysWithXorK(int[] nums, int k) {
        int n =nums.length; int XOR=0; int cnt=0;
//for (int i=0;i<n;i++){
//    for(int j=i;j<n;j++){
//XOR=XOR^nums[j];
//if(XOR==k){
//    cnt++;
//}
//    }
//}
//return cnt;

        //Optimal
        int XR=0;

            Map<Integer,Integer> m =new HashMap<>();
            m.put(0,1);
int cnt1=0;

            for(int e:nums){
                XR^=e;
                int x=XR^k;
            if(m.containsKey(x)) {
                cnt1+=m.get(x);

            }
                m.put(XR, m.getOrDefault(XR,0)+1);
        }
            return cnt1;
    }
}
