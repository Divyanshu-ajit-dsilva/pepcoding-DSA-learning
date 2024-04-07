// Any base addition

import java.util.Scanner;

public class lec_86 {
    public static int getSum(int b, int n1, int n2) {
        int rv = 0, c = 0, flag = 1, sum=0;

        while(n1 > 0 || n2 > 0 || c > 0){
                int d1 = n1 % 10;
                int d2 = n2 % 10;

                sum = d1 + d2 + c;

                c = sum / b;
                sum = sum % b;

                rv += (sum * flag);
                flag *= 10;
                
                n1 /= 10;
                n2 /= 10;
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        s.close();
    }
}
