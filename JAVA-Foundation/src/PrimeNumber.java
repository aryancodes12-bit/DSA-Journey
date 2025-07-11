import java.util.Scanner;

public class PrimeNumber {int t,n=0;
    public static void main(String[] args) {
        System.out.println("enter numbers");
Scanner sc=new Scanner(System.in);
int t= sc.nextInt();
for(int i=1;i<=t;i++) {
           int n= sc.nextInt();
           if(n%2==0){
               System.out.println("prime");
           }else {
               System.out.println("not prime");
           }
        }
    }
}
