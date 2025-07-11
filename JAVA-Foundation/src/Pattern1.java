public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5; j++){
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else if (i == j + 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
