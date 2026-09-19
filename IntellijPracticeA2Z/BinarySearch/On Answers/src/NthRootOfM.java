public class NthRootOfM {
    public int NthRoot(int N, int M) {
        int low=0;  int high=M;
        while(low<=high){

            int mid=low+(high-low)/2;
            int value = (int) Math.pow(mid, N);
            if(value==M){
                return  mid;
            }
            else if(value<M){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
