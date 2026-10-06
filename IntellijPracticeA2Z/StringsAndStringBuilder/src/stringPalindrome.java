public class stringPalindrome {
    public static void main(String[] args) {
        String s="abcdcba";
        int start=0; int end=s.length()-1;
        boolean isPalindrome=true;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
               isPalindrome=false;
               break;
            }
        }
if(isPalindrome){
    System.out.println("string is palindrome");
}
else{
    System.out.println("string is not palindrome");
}
    }
}
