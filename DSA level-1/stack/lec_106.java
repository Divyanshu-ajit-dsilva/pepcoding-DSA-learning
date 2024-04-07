// Balance Brackets

import java.util.Scanner;
import java.util.Stack;

public class lec_106 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        s.close();
    }

    public static boolean handleClosing(Stack<Character> st, char corresoch) {
        if (st.size() == 0) {
            System.out.println(false);
            return false;
        } else if (st.peek() != corresoch) {
            System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}