/*      Pattern concept of inner space and outer space
 *              *
 *          *       *
 *      *               *
 *          *       *
 *              *
*/

import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        int osp = n / 2, isp = -1;

        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                if (i == 1) {
                    for (int j = 1; j <= osp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    osp--;
                    isp += 2;
                } else {
                    for (int j = 1; j <= osp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    for (int j = 1; j <= isp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    osp--;
                    isp += 2;
                }
            } else {
                if (i == n) {
                    for (int j = 1; j <= osp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    osp--;
                    isp -= 2;
                } else {
                    for (int j = 1; j <= osp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    for (int j = 1; j <= isp; j++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                    osp++;
                    isp -= 2;
                }
            }
            System.out.println();
        }
        s.close();
    }
}
