import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + "\t*\t" + i + "\t=\t" + (n*i));
        }
        s.close();
    }
}
