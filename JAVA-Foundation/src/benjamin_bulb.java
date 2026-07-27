public class benjamin_bulb {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Bulbs that remain ON:");
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
