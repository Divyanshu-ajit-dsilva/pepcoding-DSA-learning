// program to print the inverse of a number that is swap the place and real values
import java.util.*;
public class lec24{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            int temp = n, nod = 0;

            while (temp != 0){
                temp /= 10;
                nod++;
            }

            int fv[] = new int[nod];
            int pv[] = new int[nod];

            int div = (int)Math.pow(10,nod - 1);
            int i = nod-1;
            while(div != 0){
                int q = n / div;
                fv[i] = q;
                pv[i] = i;
                n = n%div;
                div /= 10;
                i--;
            }

            for(i = 0;i < nod;i++){
                System.out.println(pv[i] + "\t" + fv[i]);
            }
            String st = "";
            for(i = 1;i <= nod;i++){
                for(int j=0; j < nod; j++){
                    if(fv[j] == i){
                        st += (pv[j] + 1); 
                    }
                }
            }
            System.out.println(st);
            sc.close();
        }
    }
}