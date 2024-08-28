import java.util.Scanner;

public class lazychef {
    public static void main(String[] args) {
        int T,V,P;
        Scanner S=new Scanner(System.in);
        T=S.nextInt();  
        for(int i=0;i<T;i++){
            V=S.nextInt();
            P=S.nextInt();
            if(P==1)
             
             System.out.println("NO");
             else if(V<5)
             System.out.println("YES");
            else
            System.out.println("NO");
            /*
             * if(V>=5 || P==1)
             * sopln ("yes")
             * instead  of else if
             * else(no)
             *
             * 
             * 
             * 
             */
        }
       S.close();
       
       
    

    }
}
