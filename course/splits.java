import java.util.Scanner;

public class splits {
    


 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n,k;
        int count;
         n = sc.nextLong();
         count = 0;
          k = 1;
        
        while (k * (k + 1) / 2 <= n) 
        {
            count++;
            k++;
        }
        
        
        System.out.println(count);
        
        sc.close();
    }
}

