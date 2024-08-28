import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        int count = 0;
        int power5 = 5;
        
        while (n >= power5) {
            count += n / power5;
            power5 = power5*5;
        }
        
        return count;
    }

    public static void main(String[] args) {                                                                                                                                                                        
   Scanner S = new Scanner(System.in);
    int n = S.nextInt();
        System.out.println(fact(n));
        
        S.close();
    }
}
