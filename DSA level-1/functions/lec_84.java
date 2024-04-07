// Any base to any base

import java.util.Scanner;

public class lec_84 {
    public static int convtodec(int n,int b1){
        int rem, temp = n, rv=0, flag =1;

        while(temp > 0){
            rem = temp % 10;
            temp = temp / 10;
            rv += (rem*flag);
            flag*=b1; 
        }

        return rv;
    }
    public static int convtogiven(int n,int b2){
        int rem, temp = n, rv=0, flag =1;

        while(temp > 0){
            rem = temp % b2;
            temp = temp / b2;
            rv += (rem*flag);
            flag*=10; 
        }

        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        System.out.println("Enter the base of the number: ");
        int b1 = s.nextInt();

        System.out.println("Enter the base to which the number is to be converted: ");
        int b2 = s.nextInt();

        int result = convtodec(n,b1);
        result = convtogiven(result,b2);

        System.out.println(result);
        s.close();
    }
}
