import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        int sp = n / 2, st = 1;

        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                sp--;
                st += 2;
            } 
            else {
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                sp++;
                st -= 2;
            }
            System.out.println();
        }
        s.close();
    }
}
