// WAP to find the sliding window maximum using NGE and in O(N)

import java.io.*;
import java.util.*;

public class lec_115 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // variable to store the size of the array
        int n = Integer.parseInt(br.readLine());
        // array to store the elements
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        // variable to store the window size
        int k = Integer.parseInt(br.readLine());

        // array to store the sliding window max
        int[] ans = new int[n - k + 1];

        // Code to find the NGE to the right
        Stack<Integer> st = new Stack<>();

        
        for (int i = 0; i < ans.length; i++) {
            for (int j = i; j < i+k; j++) {
                while (st.size() > 0 && a[j] > a[st.peek()]) {
                    st.pop();
                }
                st.push(j);
            }
            ans[i] = a[st.get(0)];
            st.clear();
        }

        System.out.println("The answer is: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}