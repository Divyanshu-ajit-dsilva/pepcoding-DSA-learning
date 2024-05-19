import java.util.*;
import java.io.*;

public class lec_119 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is wanting higher priority operators to solve first
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    
                    // for every operator 2 operands are popped
                    String v2_pre = pre.pop();
                    String v1_pre = pre.pop();

                    String v2_post = post.pop();
                    String v1_post = post.pop();

                    // evaluating the value
                    String opv_pre = operation_pre(v1_pre, v2_pre, optor);
                    String opv_post = operation_post(v1_post, v2_post, optor);

                    // pushing the value on to the stack
                    pre.push(opv_pre);
                    post.push(opv_post);
                }

                // ch is pushing itself after processing
                optors.push(ch);
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    
                    // for every operator 2 operands are popped
                    String v2_pre = pre.pop();
                    String v1_pre = pre.pop();

                    String v2_post = post.pop();
                    String v1_post = post.pop();

                    // evaluating the value
                    String opv_pre = operation_pre(v1_pre, v2_pre, optor);
                    String opv_post = operation_post(v1_post, v2_post, optor);

                    // pushing the value on to the stack
                    pre.push(opv_pre);
                    post.push(opv_post);
                }
                optors.pop();
            } else {
                pre.push(ch + "");
                post.push(ch + "");
            }

            // Printing all stacks at each iteration for debgguging purposes
            System.out.println(pre);
            System.out.println(optors);
            System.out.println(post);
            System.out.println();
        }
        while (optors.size() != 0) {
            char optor = optors.pop();
                
                // for every operator 2 operands are popped
                String v2_pre = pre.pop();
                String v1_pre = pre.pop();

                String v2_post = post.pop();
                String v1_post = post.pop();

                // evaluating the value
                String opv_pre = operation_pre(v1_pre, v2_pre, optor);
                String opv_post = operation_post(v1_post, v2_post, optor);

                // pushing the value on to the stack
                pre.push(opv_pre);
                post.push(opv_post);
        }

        System.out.println("Prefix = " + pre.peek());
        System.out.println("Postfix = " + post.peek());
    }

    public static int precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static String operation_pre(String v1, String v2, char optor) {
        if (optor == '+') {
            return (optor + v1 + v2);
        } else if (optor == '-') {
            return (optor + v1 + v2);
        } else if (optor == '*') {
            return (optor + v1 + v2);
        } else {
            return (optor + v1 + v2);
        }
    }

    public static String operation_post(String v1, String v2, char optor) {
        if (optor == '+') {
            return (v1 + v2 + optor);
        } else if (optor == '-') {
            return (v1 + v2 + optor);
        } else if (optor == '*') {
            return (v1 + v2 + optor);
        } else {
            return (v1 + v2 + optor);
        }
    }
}