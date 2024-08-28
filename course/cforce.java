import java.util.Scanner;

public class cforce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B;
        A = s.nextInt();
        B = s.nextInt();

        // Calculate floor
        System.out.println("floor " + A + " / " + B + " = " + (A / B));

        // Calculate ceil
        if (A % B == 0) {
            System.out.println("ceil " + A + " / " + B + " = " + (A / B));
        } else {
            System.out.println("ceil " + A + " / " + B + " = " + ((A / B) + 1));
        }

        // Calculate round
        double result = (double) A / B;  // Cast to double to perform floating-point division
        long round = Math.round(result);

        System.out.println("round " + A + " / " + B + " = " + round);

        s.close();
    }
}


