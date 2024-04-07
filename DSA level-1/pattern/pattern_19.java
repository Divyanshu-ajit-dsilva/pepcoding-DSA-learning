/*
 *      * * *   * 
 *          *   *   
 *      * * * * *
 *      *   *
 *      *   * * *
 */

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = s.nextInt();

        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= n;j++){
                if(i == 1){
                    if(j == n || j <= (n/2)+1)
                        System.out.print("*\t");
                    else 
                        System.out.print("\t");
                }
                else if(i <= n/2){
                    if(j == n || j == (n/2)+1)
                        System.out.print("*\t");
                    else 
                        System.out.print("\t");
                }
                else if(i == (n/2)+1){
                    System.out.print("*\t");
                }
                else if(i < n){
                    if(j == 1 || j == (n/2)+1)
                        System.out.print("*\t");
                    else 
                        System.out.print("\t");
                }
                else{
                    if(j == 1 || j >= (n/2)+1)
                        System.out.print("*\t");
                    else 
                        System.out.print("\t");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
