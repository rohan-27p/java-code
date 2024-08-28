import java.util.Scanner;

public class SplitWeights {
    
    public static int countWeights(int n) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(n);
        
        for (int k = 1; k <= sqrtN; k++) {
            if (n % k == 0) {
                count++; // k is a divisor
                if (k != n / k) {
                    count++; // n/k is a different divisor
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int result = countWeights(n);
        System.out.println(result);
    }
}
