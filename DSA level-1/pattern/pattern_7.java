// Diagonal left to right
import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sp1=0;
        for(int i=1; i <= n; i++){
            for(int j = 1;j <=sp1;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            sp1++;
            System.out.println();
        }
        s.close();
    }
}
