import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print("*");
            } System.out.println();
        }
    }
}
