// Program to find the next smaller integer to the right of an element in an array
import java.io.*;
import java.util.*;

public class nse_on_the_right {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        
        for(int val: a){
            sb.append(val+" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());

        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        
        // push the initial index on to the stack
        st.push(0);
        for(int i = 1; i < arr.length; i++){
            // run a loop till the stack is empty or element in the array is smaller than the elements in the stack
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }

            // push the index of the element on to the stack
            st.push(i);
        }

        // assiging -1 to the elements left in the stack i.e. elements not having a element smaller on the right
        while (st.size() > 0) {
            int pos = st.peek();
                nge[pos] = -1;
                st.pop();
        }

        return nge;
    }
}