package LinearSearchAlgorithm;

public class SearchIn2Darrays {
    public static void main(String[] args) {
        int target=4;
        int [][] arr= {{1,2,3},
                {4,5,6}};

 for (int i=0;i< arr.length;i++){
     for (int j =0;j<arr[i].length;j++){
         if(target==arr[i][j]){
             System.out.println("found at row "+i+"  column "+j);
         }
     }
 }
    }
}
