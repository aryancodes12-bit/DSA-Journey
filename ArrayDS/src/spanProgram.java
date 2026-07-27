import java.util.Scanner;

public class spanProgram {

        public static void main(String[] args) {
            System.out.println("enter size");
            Scanner sc= new Scanner(System.in);
            int size=sc.nextInt();
            System.out.println("enter array elements");
            int[] num= new int[size];
            for(int i=0;i<size;i++){
                num[i]=sc.nextInt();

            }
            int min= Integer.MAX_VALUE;
            int max= Integer.MIN_VALUE;

            for(int e:num){

                if(e<min){
                    min=e;
                }

                if(e>max){
                    max=e;
                }


            }
            int dif=max-min;
            System.out.println("the difference bw max and min is"+dif);
        }
    }


