// Program to find the largest integer to the right of an element in an array
import java.io.*;
import java.util.*;

public class lec_108{
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

        // Pushing the last element on to the stack
        st.push(arr[arr.length-1]);

        //Setting the value of next greatest element to the right to -1 for the last element in the array
        nge[arr.length - 1] = -1;

        //Loop from the 2nd last element of the array to the first element for comparison purpose
        for(int i = arr.length-2; i >= 0; i--){
            // pop -> answer -> push
            // pop all the elements from the stack which are smaller than or equal to the element at 'i'
            
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }

            // insert -1 in the ans array if stack is empty i.e. no greater element to the right
            if(st.size() == 0){
                nge[i] = -1;
            }
            // add the top of stack to the answer
            else {  
                nge[i] = st.peek();
            }

            // push the element on to the stack
            st.push(arr[i]);            
        }

        return nge;
    }
}