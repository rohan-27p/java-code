import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();

       
       
       for(int i=0;i<n;i++){
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int result= Math.max(a,Math.max(b,c)); 
        System.out.println(result);
       }
      
    
    }
}
