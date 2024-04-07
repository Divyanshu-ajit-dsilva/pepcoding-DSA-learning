import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=s.nextInt();

        int space=n-1,st=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j <= space; j++){
                System.out.print("\t");
            }
            space--;
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            st++;
            System.out.println();
        }
        s.close();
    }
}
