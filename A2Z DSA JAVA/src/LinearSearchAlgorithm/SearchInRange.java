package LinearSearchAlgorithm;

public class SearchInRange {
static boolean search(int []arr, int target,int start,int end){
    if(arr.length==0){
        return false;
    }
    for(int i=start;i<=end;i++){
        if(arr[i]==target) {
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        int [] arr={4,5,8,9,-7};
        boolean ans=search(arr,4,0,2);
        System.out.println(ans);
    }
}

