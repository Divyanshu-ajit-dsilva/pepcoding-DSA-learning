// Diagonal right to left
import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = s.nextInt();

        int sp1=n-1;
        for(int i=1; i <= n; i++){
            for(int j = 1;j <=sp1;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            sp1--;
            System.out.println();
        }
        s.close();
    }
}
