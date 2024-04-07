// Printing a number in reverse
import java.util.*;

public class lec21{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to be printed in reverse: ");
        int n = s.nextInt();

        while(n != 0){
            int q = n%10;
            System.out.println(q);
            n /= 10;
        }
        s.close();
    }
}