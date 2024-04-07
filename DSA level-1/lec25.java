// WAP to rotate a number
import java.util.*;
public class lec25{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be rotated: ");
        int n = s.nextInt();
        System.out.println("Enter the limit of rotation: ");
        int k = s.nextInt();
        int temp = n,nod = 0;
        while (temp > 0) {
            temp /=10;
            nod++;
        }

        k = k % nod;

        if(k < 0){
            k = k + nod;
        }

        int div = 1,q=0,rem=0,r=0;
        int mul = 1;
        for (int i = 1;i <= nod;i++){
            if(i <= k){
                div = div*10;
            }
            else{
                mul = mul * 10;
            }
        }
        q = n/div;
        rem = n%div;
            
        r = rem * mul + q;
        System.out.println(r);
        s.close();  
    }
}