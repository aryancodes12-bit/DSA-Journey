public class ReverseArrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int l=arr.length;
        int temp=0;
        int gif=Math.floorDiv(l,2);
        for (int i=0;i<gif;i++){

           temp= arr[i];
      arr[i] = arr[l-i-1];
            arr[l-i-1]=temp;

        }
for (int e :arr){
    System.out.println(e);
}
        System.out.println();
    }

}
