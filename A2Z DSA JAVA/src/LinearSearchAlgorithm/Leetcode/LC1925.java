package LinearSearchAlgorithm.Leetcode;

public class LC1925 {
    public static int findNumbers(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }
        int count = 0;
        for (int e : nums) {

            if (hasEvenDig(e)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDig(int num) {
        int noOfEven = countDig(num);
        return noOfEven % 2 == 0;
    }

    static int countDig(int n) {
        int count = 0;
        // Keep dividing by 10 until no digits remain
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main (String[]args){

        int[] arr = {425, 458, 111, 1233};
        int ans =findNumbers(arr) ;
        System.out.println(ans);
    }

    }
