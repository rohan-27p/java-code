 import java.util.Scanner;
 
public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        int hh = Integer.parseInt(parts[0]);
        String col = parts[1];
        int mm = Integer.parseInt(parts[2]);
        int a = sc.nextInt();
 
        if (hh < 0 || hh >= 24 || mm < 0 || mm >= 60) {
            System.out.println("The inputs are not in the domain.");
            sc.close();
            return;
        }
 
        mm = mm + a;
        hh = hh + (mm / 60);
        mm = mm % 60;
        hh = hh % 24;
 
        System.out.printf("%02d:%02d\n", hh, mm);
 
        sc.close();
    }
}
    

