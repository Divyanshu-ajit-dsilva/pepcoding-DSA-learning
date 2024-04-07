// Span of an array

import java.util.Scanner;

public class lec_94 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int max, min;

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        max = arr[0];
        min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min)
                min = arr[i];

            if (arr[i] >= max)
                max = arr[i];
        }

        System.out.println("Span of the array is: " + (max - min));
        s.close();
    }
}
