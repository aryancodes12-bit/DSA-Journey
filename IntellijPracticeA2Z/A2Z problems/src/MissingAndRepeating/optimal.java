package MissingAndRepeating;

public class optimal {
    public int[] findErrorNums(int[] nums) {
   int n =nums.length;
    int [] num=new int[2];
    int sum1=0;
    int sum2=0;
    int sumOfn=0;
    int sumOfn2=0;

    for(int i=0;i<n;i++){
        sum1+=nums[i];
        sum2+=nums[i]*nums[i];
    }
    for(int i=1;i<=n;i++){
        sumOfn+=i;
        sumOfn2+=(i*i);
    }
    int sol1=sum1-sumOfn;
    int sol2=sum2-sumOfn2;
        // x-y=sol1    x-y=sol2 how do i solve this eqn
        int x=(sol1+(sol2)/sol1)/2;
        int y=x-sol1;
        num[0]=x;
        num[1]=y;

return num;
    }
}
