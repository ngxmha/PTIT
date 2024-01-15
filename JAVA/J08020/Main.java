package J08020;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void isCorrect() {
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.add(s.charAt(i));
            } else {
                if (st.empty()) {
                    System.out.println("NO");
                    return;
                } else if (st.peek() == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else if (st.peek() == '[' && s.charAt(i) == ']') {
                    st.pop();
                } else if (st.peek() == '{' && s.charAt(i) == '}') {
                    st.pop();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            isCorrect();
        }
    }
}
