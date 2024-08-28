import java.util.Scanner;

public class goodbad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String n = sc.nextLine(); 
            int odds = 0, evens = 0; //oddssum evensum

           
            for (int j = 0; j < n.length(); j++) {
                int digit = n.charAt(j) - '0';

                
                if ((j + 1) % 2 == 0) { 
                    evens += digit;
                } else {
                    odds += digit;
                }
            }

            
            if (odds % 2 == 0 && evens % 2 != 0) {
                System.out.println("good");
            } else {
                System.out.println("not good");
            }
        }

        sc.close();
    }
}

