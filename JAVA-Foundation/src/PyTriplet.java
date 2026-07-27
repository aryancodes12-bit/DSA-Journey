import java.util.Scanner;

public class PyTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int h = sc.nextInt();
        if((h*h)==(a*a)+(b*b) && h>b&& h>a){
            boolean bo=true;
            System.out.println(bo);
        }
        else{
            System.out.println("not valid");
        }
    }
}
