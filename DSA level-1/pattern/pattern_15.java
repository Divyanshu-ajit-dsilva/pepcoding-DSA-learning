
/*
 *  __1__
 *  _232_
 *  34543
 *  _232_
 *  __1__
 */
import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        int sp = 2, st = 1, val = 1;

        for (int i = 1; i <= n; i++) {
            int temp = val;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(temp + "\t");
                if (j <= st / 2)
                    temp++;
                else
                    temp--;
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }

            System.out.println();
        }
        s.close();
    }
}
