/*
 *      1     1
 *      12   21
 *      123 321
 *      1234321
 */

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = s.nextInt();

        int sp = (2*n)-3,st=1;

        for(int i=1; i <= n; i++){
            for(int j=1; j<=st;j++){
                System.out.print(j+"\t");
            }
            for(int j=1; j<=sp;j++){
                System.out.print("\t");
            }
            if(i == n)
                st--;
            for(int j=st; j>=1;j--){
                System.out.print(j+"\t");
            }
            sp-=2;
            st++;
            System.out.println();
        }
        s.close();
    }
}
