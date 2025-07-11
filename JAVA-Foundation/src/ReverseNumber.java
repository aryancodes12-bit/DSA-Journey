import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n !=0){
            n=n/10;
            rev++;
        }
        System.out.println(rev);
    }
}
