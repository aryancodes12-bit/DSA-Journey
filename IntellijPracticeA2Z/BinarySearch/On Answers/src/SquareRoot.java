public class SquareRoot {
    public int floorSqrt(int n) {
        int low=0;  int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=(n/mid)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    }

