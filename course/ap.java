import java.util.*;

public class ap {
    

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();  

        while (T-- > 0) 
        {
            int n = s.nextInt();  
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            if (n == 1) {
                System.out.println("Happy");
                continue;
            }
            Arrays.sort(arr);

            
            int cd = arr[1]- arr[0] ;
            boolean isAP = true;

            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] != cd) {
                    isAP = false;
                    break;
                }
            }

          
            if (isAP) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }

        s.close();
    }
}


