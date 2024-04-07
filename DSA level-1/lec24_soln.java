// program to print the inverse of a number that is swap the place and real values
import java.util.*;
public class lec24_soln{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int inv = 0,op = 1;
        while(n != 0){
            int od = n % 10;
            int id = op;
            int ip = od;

            // make change in inv using ip and id
            inv = inv + (id * (int)Math.pow(10,ip-1));

            n = n/10;
            op++;
        }

        System.out.println(inv);
        s.close();
    }
}