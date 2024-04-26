// Program to find the next smaller element on the left
import java.util.*;
import java.io.*;
public class nge_to_the_left {
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

        // Pushing the last index on to the stack
        st.push(arr.length-1);
        
        // Variable to store the popped element
        int popped = 0;

        //Loop from the 2nd last element of the array to the first element for comparison purpose
        for(int i = arr.length-2; i >= 0; i--){
            // pop -> answer -> push
            // pop all the elements from the stack which are smaller than or equal to the element at 'i'
            // add the array element to the answer
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                popped = st.pop();
                nge[popped] = arr[i];
            }

            // Pushing the index on to the stack
            st.push(i);

        }

        // While loop to set the answer of the index left in the stack to zero
        while (st.size() > 0) {
            popped = st.pop();
            nge[popped] = -1;
        }

        return nge;
    }    
}