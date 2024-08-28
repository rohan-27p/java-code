import java.util.Scanner;

public class alice {
    public static void main(String[] args) 
    {
        long n;
        Scanner s=new Scanner(System.in);
        n=s.nextLong();
        if(n>0 && n%2==0)
        {
            if(n%4==0){
                System.out.println("Special Even");
            }
            else if(n<10){
                System.out.println("Small Even");
            }else{
                System.out.println("Large Even");
            }
 
        
        }
        if(n>0 && n%2!=0)
        {
            if(n%3==0){
                System.out.println("Special Odd");

            }
            else if(n<10){
                System.out.println("Small Odd");

            }
            else{
                System.out.println("Large Odd");
            }

        }
        if(n==0){
            System.out.println("Zero");
        
        }
        if(n<0 && n%2==0)
        {
            if(n%4==0){
                System.out.println("Special Negative Even");

            }
            else if(n>-10){
                System.out.println("Small Negative Even");

            }
            else{
                System.out.println("Large Negative Even");
            }
        } 
        if(n<0 && n%2!=0)
        {
            if(n%3==0){
                System.out.println( "Special Negative Odd");

            }
            else if(n>-10){
                System.out.println("Small Negative Odd");

            }
            else{
                System.out.println("Large Negative Odd");
            }
        }

    }
}
