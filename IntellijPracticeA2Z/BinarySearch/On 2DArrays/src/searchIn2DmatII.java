public class searchIn2DmatII {
    //brute
    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        // Stop early if the matrix has no usable cells.
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Return immediately because the target is found here.
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

     */
    // OPTIMAL
    public boolean searchMatrix(int[][] matrix, int target) {
int n=matrix.length;
int m=matrix[0].length;
int row=0; int col=m-1;
while(row<n && col>=0){
    if(matrix[row][col]==target){
        return true;
    }
    else if(matrix[row][col]<target){
        row++;
    }
    else{
        col++;
    }
}
return false;
    }

}
