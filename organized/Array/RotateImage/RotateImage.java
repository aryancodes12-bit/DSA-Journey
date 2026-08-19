class Solution {
    public void swapTranspose(int[][] matrix,int i, int j) {
                int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
    void swapRow(int [] []matrix,int i,int left,int right){
        int temp=matrix[i][left];
        matrix[i][left]=matrix[i][right];
        matrix[i][right]=temp;
    }
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swapTranspose(matrix ,i,j);
            }
        }

for(int i=0;i<n;i++){
   int left=0; int right=n-1;
       
       while(left<right){
         swapRow(matrix,i,left,right);
         left++;
         right--;
       }
    
}
    }
}