import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int e:nums){
        m.put(e,m.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>n/3){
            l.add(entry.getKey());
            }
        }
        return l;

    }
}