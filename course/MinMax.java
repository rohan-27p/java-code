import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
      
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
       
        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        
        
        System.out.println(min + " " + max);
    }
}
