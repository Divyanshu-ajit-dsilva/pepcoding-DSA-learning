// Differnce of two arrays

import java.util.Scanner;

public class lec_102 {
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

        int[] diff = new int[size2];

        int c = 0, i = size1 - 1, j = size2 - 1, k = diff.length - 1;
        while (k >= 0) {
            int d = 0;

            int a1v = i >= 0 ? arr1[i] : 0;

            if(arr2[j] + c >= a1v){
                d = arr2[j] + c - a1v;
                c = 0;
            }   else {
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }
        int index = 0;
        while(index < diff.length){
            if (diff[index] == 0){
                index++;
            }   else{
                break;
            }
        }
        while(index < diff.length){
            System.out.print(diff[index]);
            index++;
        }
        s.close();
    }
}
