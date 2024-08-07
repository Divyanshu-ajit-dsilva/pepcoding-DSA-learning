// Program to remove prime numbers from an ArrayList
import java.util.*;

public class remove_prime {
    public static void solution(ArrayList<Integer> al){
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if (isPrime(val) == true) {
                al.remove(i);
            }
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(s.nextInt());
        }
        solution(al);
        System.out.println(al);
        s.close();
    }
}

