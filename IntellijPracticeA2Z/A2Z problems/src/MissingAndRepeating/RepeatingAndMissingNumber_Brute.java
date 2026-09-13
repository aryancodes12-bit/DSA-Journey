package MissingAndRepeating;

public class RepeatingAndMissingNumber_Brute {
    public int[] findMissingRepeatingNumbers(int[] nums) {
int n= nums.length;
int [] a=new int[2];
int repeating=0; int missing=0;
for(int i=1;i<=n;i++){
    int cnt=0;
    for(int j=0;j<n;j++){
        if(nums[j]==i){
            cnt++;
        }
        if(cnt>1){
            repeating=i;
            a[0]=repeating;
        } else if (cnt==0) {
            missing=i;
            a[1]=missing;
        }
        if(repeating==-1&& missing==-1){
            break;
        }
    }
}
return a;
    }


}
