import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        
        int N = S.nextInt();
        int M = S.nextInt();
        S.nextLine(); 

        
        int R = 0;
        int B = 0;

        
        for (int i = 0; i < N; i++) {
            String x = S.nextLine();
            for (int j = 0; j < M; j++) {
                char c = x.charAt(j);
                if (c == 'R') {
                    R++;
                } else if (c == 'B') {
                    B++;
                }
            }
        }

        
        int oper = Math.max(R, B);

        
        System.out.println(oper);

        S.close();
    }
}

