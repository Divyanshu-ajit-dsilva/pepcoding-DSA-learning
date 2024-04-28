// WAP to find the largest area histogram i.e. the rectangle having max area in a bar graph
import java.io.*;
import java.util.*;

public class lec_113 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // variable to store the horizontal length of the graph
        int n = Integer.parseInt(br.readLine());
        // array to store the bar graph
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        //code
        // right boundary
        int[] rb = new int[n]; // NSE index on the right

        Stack<Integer> st  = new Stack<>();

        // pushing the last index on to the stack
        st.push(n-1);
        // setting the NSE on the right for last element as array's length
        rb[n-1] = n;

        for(int i = n - 2; i >= 0; i--){
            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }

            if(st.size() == 0){
                rb[i] = n;
            }
            else{
                rb[i] = st.peek();
            }

            st.push(i);
        }

        // left boundary
        int[] lb = new int[n]; // NSE index on the left

        Stack<Integer> st1  = new Stack<>();

        // pushing the first index on to the stack
        st1.push(0);
        // setting the NSE on the left for first element as -1
        lb[0] = -1;

        for(int i = 1; i < n; i++){
            while (st1.size() > 0 && a[i] <= a[st1.peek()]) {
                st1.pop();
            }

            if(st1.size() == 0){
                lb[i] = n;
            }
            else{
                lb[i] = st1.peek();
            }

            st1.push(i);
        }
        // variable to store the maximum area
        int maxArea = 0;
        // loop to find the max area
        for(int i = 0; i < n; i++){
             int width = rb[i] - lb[i] - 1;
             int area = width * a[i];
             if(area > maxArea){
                maxArea = area;
             }
        }

        System.out.println(maxArea);
    }
}