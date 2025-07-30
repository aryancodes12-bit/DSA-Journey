import java.util.Scanner;
import java.util.Stack;
public class balanced_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                System.out.println(true);
                return;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    System.out.println(false);
                    return;
                }
            }
        }
    }

}