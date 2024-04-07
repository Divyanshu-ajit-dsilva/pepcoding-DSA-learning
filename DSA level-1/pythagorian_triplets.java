import java.util.*;
public class pythagorian_triplets{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three sides of the right angled triangle: ");
        int s1=s.nextInt();
        int s2=s.nextInt();
        int s3=s.nextInt();

        int largest = s1;

        if(s2 >= largest){
            largest = s2;
        }

        if(s3 >= largest){
            largest = s3;
        }

        int sos=0,soe=0;

        if(largest == s1){
            sos=s1*s1;
            soe = s2*s2 + s3*s3;
            if(sos == soe){
                System.out.println(s1+","+s2+","+s3+" are a pyhtagorian triplet.");
            }
            else{
                System.out.println(s1+","+s2+","+s3+" are not a pyhtagorian triplet.");
            }
        }
        else if(largest == s2){
            sos=s2*s2;
            soe = s1*s1 + s3*s3;
            if(sos == soe){
                System.out.println(s1+","+s2+","+s3+" are a pyhtagorian triplet.");
            }
            else{
                System.out.println(s1+","+s2+","+s3+" are not a pyhtagorian triplet.");
            }
        }
        else{
            sos=s3*s3;
            soe = s2*s2 + s1*s1;
            if(sos == soe){
                System.out.println(s1+","+s2+","+s3+" are a pyhtagorian triplet.");
            }
            else{
                System.out.println(s1+","+s2+","+s3+" are not a pyhtagorian triplet.");
            }
        }
        s.close();
    }
}