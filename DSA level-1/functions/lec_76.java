// Frequency of digits
import java.util.Scanner;

public class lec_76 {
    public static long freq(long n,int f){

        long temp = n,dig,fre=0;
        while (temp != 0) {
            dig = temp % 10;
            if(dig == f)
                fre++;
            temp /= 10;
        }
        return fre;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        long n = s.nextLong();
        System.out.println("Enter the digit whose frequency has to be found: ");
        int f = s.nextInt();   

        System.out.println("The frequency of" + f +" in "+ n +" is: "+ freq(n,f));

        s.close();
    }
}
