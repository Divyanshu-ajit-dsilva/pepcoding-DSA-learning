// Any base to decimal

import java.util.Scanner;

public class lec_82 {
    public static int conv(int n,int b){
        int rem, temp = n, rv=0, flag =1;

        while(temp > 0){
            rem = temp % 10;
            temp = temp / 10;
            rv += (rem*flag);
            flag*=b; 
        }

        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number to be converted to decimal: ");
        int n = s.nextInt();

        System.out.println("Enter the base: ");
        int b = s.nextInt();

        int result = conv(n,b);
        System.out.println(result);
        s.close();
    }
}
