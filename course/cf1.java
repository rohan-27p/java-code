import java.util.Scanner;

public class cf1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
  
        int x = s.nextInt();  
        
        int steps = x / 5;
        
        int rem = x % 5; 
       
        if (rem > 0) {
            steps += 1;
        }
        
        
        System.out.println(steps);
        
        s.close();
    }


    }
    

