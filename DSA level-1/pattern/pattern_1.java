import java.util.*;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=s.nextInt();

        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        s.close();
    }
}
