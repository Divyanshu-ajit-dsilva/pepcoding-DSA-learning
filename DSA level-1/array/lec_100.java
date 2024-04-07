// Sum of two arrays

import java.util.Scanner;

public class lec_100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();

        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int size2 = s.nextInt();

        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }
        int[] sum = new int[size1 > size2 ? size1 : size2];

        int c = 0, i = size1 - 1, j = size2 - 1, k = sum.length - 1;
        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if(c != 0)
            System.out.print(c);
        for (int val : sum) {
            System.out.print(val);
        }
        s.close();
    }
}
