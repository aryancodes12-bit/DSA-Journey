import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n =matrix.length;
        int m=matrix[0].length;
        int left=0; int right=m-1;
        int bottom=n-1; int top=0;
        List<Integer> l=new ArrayList<>();
        while(left<=right&& top<=bottom){
        for(int i=left;i<=right;i++){
            l.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            l.add(matrix[i][right]);
        }
        right-=1;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            l.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            l.add(matrix[i][left]);
        }
        left++;
        }
        } return l;
    }
   
}