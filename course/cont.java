import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long a,b;
        a = 0;
        b = 0;

        
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            if (num % 2 == 0) {
                b += num; 
            } else {
                a+= num; 
            }
        }

   
        if (a > b) {
            System.out.println("Alice");
        } else if (b > a) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
        
        s.close();
    }
}
