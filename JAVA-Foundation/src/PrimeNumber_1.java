import java.util.Scanner;

public class PrimeNumber_1 {
    public static void main(String[] args) {
        /* METHOD 1
        System.out.println("enter range");
        Scanner sc=new Scanner(System.in);
        int low= sc.nextInt();
        int high= sc.nextInt();
        for(int i=low;i<=high;i++){
            if (i%2==0) {
                System.out.println();
            }
            else{
                System.out.println(i);
            }
        }*/
        //METHOD 2
        System.out.println("enter range");
        Scanner sc=new Scanner(System.in);
        int low= sc.nextInt();
        int high= sc.nextInt();
        for(int i=low;i<=high;i++) {
            int count=0;
            for(int div=0;div*div<=i;div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
                if(count==0){
                    System.out.println(i);
                }
        }
        }
    }

