// program to evaluate the infix expression

import java.util.*;
import java.io.*;

public class lec_117 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // variable to store the input string
        String exp = br.readLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                // push onto the operators stack
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                // push onto the operands stack
                opnds.push(ch - '0');           // char to int
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    
                    // for every operator 2 operands are popped
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    // evaluating the value
                    int opv = operation(v1, v2, optor);

                    // pushing the value on to the stack
                    opnds.push(opv);
                }

                // popping to remove the opening bracket
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // ch is wanting higher priority operators to solve first
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    
                    // for every operator 2 operands are popped
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    // evaluating the value
                    int opv = operation(v1, v2, optor);

                    // pushing the value on to the stack
                    opnds.push(opv);
                }

                // ch is pushing itself after processing
                optors.push(ch);
            }
        }
        while (optors.size() != 0) {
            char optor = optors.pop();
            
            // for every operator 2 operands are popped
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            // evaluating the value
            int opv = operation(v1, v2, optor);

            // pushing the value on to the stack
            opnds.push(opv);
        }
        System.out.println(opnds.peek());
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

    public static int operation(int v1, int v2, char optor){
        if(optor == '+'){
            return v1 + v2; 
        } else if(optor == '-'){
            return v1 - v2;
        } else if(optor == '*'){
            return v1 * v2;
        } else{
            return v1 / v2;
        }
    }
}
