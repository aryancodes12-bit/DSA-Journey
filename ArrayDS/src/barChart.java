import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array elements");
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;

        for (int e : num) {

            if (e >max) {
                max = e;
            }
        }
        for (int floor = max; floor>=1; floor--) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
