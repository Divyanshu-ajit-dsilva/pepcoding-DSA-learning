import java.util.*;
import java.io.*;

public class lec_115_vid {
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

        Stack<Integer> st = new Stack<>();

        int[] nge = new int[n];

        st.push(n - 1);

        nge[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            // -a+
            while (st.size() > 0 && a[i] >= a[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
        }

        int j = 0;
        for (int i = 0; i <= n - k; i++) {
            // Enter the loop to find the maximum of window starting at i
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }

            System.out.print(a[j] + " ");
        }
    }
}