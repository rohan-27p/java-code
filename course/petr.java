import java.util.*;

public class petr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,a,b;
        n=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        int result;
        result=Math.min(n-a,b+1);
        System.out.println(result);
    }
}
