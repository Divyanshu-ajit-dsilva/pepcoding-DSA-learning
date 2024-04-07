
// Lecture 75
import java.util.Scanner;

public class permutation {
    public static int fact(int n) {
        int rv = 1;
        for (int i = 1; i <= n; i++) {
            rv *= i;
        }
        return rv;
    }

    public static void display(int n, int r, int npr){
        System.out.println(n + "P" + r +" = "+ npr);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();

        System.out.println("Enter the value of r: ");
        int r = s.nextInt();

        int fn = fact(n);
        int fnmr = fact(n-r);

        int npr = fn/fnmr;

        display(n, r, npr);
        s.close();
    }
}