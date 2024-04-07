import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = s.nextInt();

        int i, j, val = 0, a = 0, b = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                val = a + b;
                a = b;
                b = val;
            }
            System.out.println();
        }
        s.close();
    }
}
