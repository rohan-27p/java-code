import java.util.Scanner;

public class cfa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n,k;
        n=s.nextInt();
        k=s.nextInt();
     //thats how large the code is
        System.out.println(n + (k - (n%k)));
    }

}
    

