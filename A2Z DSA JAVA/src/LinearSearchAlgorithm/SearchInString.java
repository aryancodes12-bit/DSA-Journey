package LinearSearchAlgorithm;

public class SearchInString {
    public static void main(String[] args) {
        String str = "aryan";
        char target = 'a';

        System.out.println(search(str, target));
    }

 //   static void search(String[] str, String target) {
//        if (str.length == 0) {
//            System.out.println("Array is empty");
//            return; // Exit early if empty
//        }
//
//        for (int i = 0; i < str.length; i++) {
//            // Directly compare strings using .equals()
//            if (str[i].equals(target)) {
//                System.out.println("Found at index " + i);
//                return; // Stop searching once found
//            }
//        }
//
//        System.out.println("Element not found in the array");
//    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}