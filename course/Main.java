import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        
        int remainder = n % k;
        int x;
        
        if (remainder == 0) {
            // n is already a multiple of k, so we need the next multiple
            x = n + k;
        } else {
            // Find the next multiple greater than n
            x = n + (k - remainder);
        }

        // Print the result
        System.out.println(x);
    }
}

