package LinearSearchAlgorithm;

public class SearchInString {
    public static void main(String[] args) {
        String[] str = {"aryan", "anagha", "riyaRaj"};
        String target = "anagha";

        // Call the search method
        search(str, target);
    }

    static void search(String[] str, String target) {
        if (str.length == 0) {
            System.out.println("Array is empty");
            return; // Exit early if empty
        }

        for (int i = 0; i < str.length; i++) {
            // Directly compare strings using .equals()
            if (str[i].equals(target)) {
                System.out.println("Found at index " + i);
                return; // Stop searching once found
            }
        }

        System.out.println("Element not found in the array");
    }
}