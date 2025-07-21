import java.util.Scanner;

public class Prime_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for (int div = 2; div < n1; div++) {
            while (n1 % div == 0) {
                n1 = n1 / div;
                System.out.print(div+" ");
            }
        }
if(n1 !=1){
    System.out.print(n1);
}
        }
    }

