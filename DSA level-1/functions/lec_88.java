// Any base subtraction

import java.util.Scanner;

public class lec_88 {
    public static int getDifference(int b, int n1, int n2){
        int rv = 0,flag = 1, d=0, borrow=0;

        while (n1 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            d1 = d1 + borrow;

            if(d1 < d2){
                d1 += b;
                borrow = -1;
            }
            else{
                borrow = 0;
            }
            d = d1 - d2;
            rv += (d*flag);
            flag  *= 10; 
            
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

        int d = getDifference(b, n1, n2);

        System.out.println(d);
        s.close();
    }
}
