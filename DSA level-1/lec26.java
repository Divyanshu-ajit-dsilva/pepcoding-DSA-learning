// WAP to print the GCD and LCM of two numbers
import java.util.*;
public class lec26{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int on1 = num1, on2 =num2;

        
        int q = num2 / num1, rem = num2 % num1;

        while(rem != 0){
            num2 = num1;
            num1 = rem;
            rem = num2 % num1;
        }

        int gcd = num1;
        System.out.println("GCD = "+ gcd);

        int lcm = (on1 * on2)/gcd;
        System.out.println("LCM = "+ lcm);
        s.close();  
    }
}