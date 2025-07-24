public class elementFind{
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int number = 12;
        boolean isInArr = false;

        for (int element : num) {
            if (number == element) {
                isInArr = true;
                break;
            }
        }

        if (isInArr) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
    }
}

