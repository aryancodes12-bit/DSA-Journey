import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("enter size for 1st arr");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        System.out.println("enter array elements");
        int[] num1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            num1[i] = sc.nextInt();
        }
            System.out.println("enter size for 2nd arr");
            int size2 = sc.nextInt();
            System.out.println("enter array elements");
            int[] num2 = new int[size2];
            for(int i=0;i< size2;i++){
            num2[i] = sc.nextInt();
        }
        int maxSize = Math.max(size1, size2);
        int[] sum = new int[maxSize];

        for (int i = 0; i < maxSize; i++) {
            int val1 = (i < size1) ? num1[i] : 0;
            int val2 = (i < size2) ? num2[i] : 0;
            sum[i] = val1 + val2;
        }

        System.out.println("sum of arrays is");
        for(int s:sum){
            System.out.println(s+" ");
        }
    }
}