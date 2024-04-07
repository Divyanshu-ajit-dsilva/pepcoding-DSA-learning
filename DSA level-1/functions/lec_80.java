// Decimal to any base

import java.util.Scanner;

public class lec_80 {
    public static int conv(int n,int b){
        int rem, temp = n, rv=0, flag =1;

        while(temp > 0){
            rem = temp % b;
            temp = temp / b;
            rv += (rem*flag);
            flag*=10; 
        }

        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number in decimal: ");
        int n = s.nextInt();

        System.out.println("Enter the base: ");
        int b = s.nextInt();

        int result = conv(n,b);
        System.out.println(result);
        s.close();
    }
}
