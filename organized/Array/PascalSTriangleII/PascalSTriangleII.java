import java.util.*;
class Solution {
    public int function(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
        res=res/(i+1);
        }
        return (int) res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
for(int c=0;c<=rowIndex;c++){
l.add(function(rowIndex,c));
}
 return l;
    }
}