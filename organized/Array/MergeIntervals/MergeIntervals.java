import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {

     
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
int [] [] temp=new int[intervals.length] [2];

int cnt=0;
int i=0;
int n =intervals.length;
    
    while(i<n){
        int start=intervals[i][0];
        int end =intervals[i][1];
        int j =i+1;
          while (j < n && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            temp[cnt][0]=start;
            temp[cnt][1]=end;
            cnt++;
            i=j;
    }
    return Arrays.copyOf(temp,cnt);
    }
}