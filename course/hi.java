import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age; 
        age = s.nextInt();
        
        if(age <= 0 || age >= 120){
            System.out.println("invalid");
        }
        else if (age >= 1 && age <= 120 && age + 5 >= 18) {
        
            System.out.println("eligible");
            
        } 
        else {
            System.out.println("not eligible");
        }

        s.close();
    }
}

    

