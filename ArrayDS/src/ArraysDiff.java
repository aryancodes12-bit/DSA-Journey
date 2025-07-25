import java.util.Scanner;
public class ArraysDiff {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter size for 1st array:");
            int size1 = sc.nextInt();
            int[] num1 = new int[size1];
            System.out.println("Enter elements for 1st array:");
            for (int i = 0; i < size1; i++) {
                num1[i] = sc.nextInt();
            }


            System.out.println("Enter size for 2nd array:");
            int size2 = sc.nextInt();
            int[] num2 = new int[size2];
            System.out.println("Enter elements for 2nd array:");
            for (int i = 0; i < size2; i++) {
                num2[i] = sc.nextInt();
            }


            int maxSize = Math.max(size1, size2);
            int[] diff = new int[maxSize];

            for (int i = 0; i < maxSize; i++) {
                int val1 = (i < size1) ? num1[i] : 0;
                int val2 = (i < size2) ? num2[i] : 0;
                diff[i] = val1 - val2;
            }


            System.out.println("Difference of arrays (num1 - num2):");
            for (int d : diff) {
                System.out.print(d + " ");
            }
        }
    }

}
