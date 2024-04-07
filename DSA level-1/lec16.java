import java.util.*;
public class lec16 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int m = n;
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        System.out.println("The no of digits in "+m+ " is "+ (count));
        s.close();
    }
}
