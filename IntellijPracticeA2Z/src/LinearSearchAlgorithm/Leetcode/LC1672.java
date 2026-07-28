package LinearSearchAlgorithm.Leetcode;

public class LC1672 {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i =0;i<accounts.length;i++){
            int sum=0;
            for (int j = 0; j <accounts[i].length ; j++) {

               sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LC1672 lc=new LC1672();
        int [][] arr={{1,2,3},
                {1,2,3}};
        int ans= lc.maximumWealth(arr);
        System.out.println(ans);
    }
}
