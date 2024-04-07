// searching an element

import java.util.Scanner;

public class lec_96 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int pos = -1, ele;
        ele = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
        s.close();
    }
}
