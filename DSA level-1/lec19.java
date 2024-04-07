import java.util.*;
public class lec19{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int nod = 0;
        int temp = n;

        while(temp != 0){
            temp /= 10;
            nod++;
        }

        int div = (int)Math.pow(10,nod - 1);
        while(div != 0){
            int q = n / div;
            System.out.println(q);
            n = n%div;
            div /= 10;
        }
        s.close();
    }
}
