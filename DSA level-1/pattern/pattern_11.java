import java.util.Scanner;

public class pattern_11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = s.nextInt();

        int i,j,flag=1;
        for(i = 1;i <= n;i++){
            for(j = 1;j <= i;j++){
                System.out.print(flag+"\t");
                flag++;
            }
            System.out.println();
        }
        s.close();
    }
}
