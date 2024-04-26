
// Program to find the stock span of an array where the span is the how far the next greater element to the right is
// Program to find the next greater element on the left
import java.util.*;
import java.io.*;

public class lec_111 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());

        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        // Array to store the span
        int span[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        // Setting span of first element to 1
        span[0] = 1;

        // Pushing the index of the first element on to the stack
        st.push(0);

        // Loop to iterate through the array
        for (int i = 1; i < arr.length; i++) {

            // Loop to pop until the elements in the stack are smaller than the current element in the array
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // If stack is empty then span = index + 1
            if(st.size() == 0){
                span[i] = i+1;
            }
            // Else span = current index - TOS
            else{
                span[i] = i - st.peek();
            }
            // Pushing the current index on to the stack
            st.push(i);
        }
        return span;
    }
}