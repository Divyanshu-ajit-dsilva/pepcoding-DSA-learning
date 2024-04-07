import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        int sp = 1, st = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                st--;
                sp+=2;
            } else {
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                st++;
                sp-=2;
            }
            System.out.println();
        }
        s.close();
    }
}
