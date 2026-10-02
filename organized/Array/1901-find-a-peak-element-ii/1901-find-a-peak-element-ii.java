class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;  int m=mat[0].length;
        for(int i=0;i<n;i++){
for(int j=0;j<mat[i].length;j++){
    if((i == 0 || mat[i][j] > mat[i - 1][j]) &&
                    (i == n - 1 || mat[i][j] > mat[i + 1][j]) &&
                    (j == 0 || mat[i][j] > mat[i][j - 1]) &&
                    (j == m - 1 || mat[i][j] > mat[i][j + 1])){
        return new int[] {i,j};
    }
}

        }
        return new int[] {-1,-1};
    }
}