import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n=s.nextInt();
        int temp=n;
     int nod=0;
      while(temp !=0){
          temp=temp/10;
          nod++;
      }
      int div=1;
      int mul=1;
        for(int i=0;i<nod;i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }}
       int q=n/div;
        int r=n%div;
        r=(r*mul) +q;
        System.out.println(r);        }
    }

