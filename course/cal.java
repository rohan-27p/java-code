
import java.util.Scanner;
public class cal {
    



 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int m = sc.nextInt();
        int d = sc.nextInt();
        
       
        int monthdays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
       
        int days = monthdays[m];
        
        
        int fwdays = 8 - d; //firstweekdays
        
        
        int rem = days - fwdays;
        
        
        int fullweeks = (rem + 6) / 7; 
        
      
        int totalCols = 1 + fullweeks; 
        
        
        System.out.println(totalCols);
        
        sc.close();
    }
}
