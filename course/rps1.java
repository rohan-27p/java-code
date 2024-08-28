import java.util.Scanner;
public class rps1 {
    

 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p1, p2, p3;
        p1 = s.next();
        p2 = s.next();
        p3 = s.next();
        
        // Condition for F (p1 wins against both p2 and p3)
        if ((p1.equals("scissors") && p2.equals("paper") && p3.equals("paper")) ||
            (p1.equals("paper") && p2.equals("rock") && p3.equals("rock")) ||
            (p1.equals("rock") && p2.equals("scissors") && p3.equals("scissors"))) {
            System.out.println("F");
        } 
        // Condition for M (p2 wins against both p1 and p3)
        else if ((p2.equals("scissors") && p1.equals("paper") && p3.equals("paper")) ||
                 (p2.equals("paper") && p1.equals("rock") && p3.equals("rock")) ||
                 (p2.equals("rock") && p1.equals("scissors") && p3.equals("scissors"))) {
            System.out.println("M");
        } 
        // Condition for S (p3 wins against both p1 and p2)
        else if ((p3.equals("scissors") && p1.equals("paper") && p2.equals("paper")) ||
                 (p3.equals("paper") && p1.equals("rock") && p2.equals("rock")) ||
                 (p3.equals("rock") && p1.equals("scissors") && p2.equals("scissors"))) {
            System.out.println("S");
        } 
        // If none of the above, print "?"
        else {
            System.out.println("?");
        }
    }
}

