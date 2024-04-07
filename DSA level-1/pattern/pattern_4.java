import java.util.Scanner;

public class pattern_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=s.nextInt();

        int space=0,st=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j <= space; j++){
                System.out.print("\t");
            }
            space++;
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            st--;
            System.out.println();
        }
        s.close();
    }
}
