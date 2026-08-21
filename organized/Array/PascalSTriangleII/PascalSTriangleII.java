import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
        long res=1;
        l.add((int)res);
for(int c=1;c<=rowIndex;c++){
res=res*(rowIndex-c+1)/c;
l.add((int)res);
}
 return l;
    }
}