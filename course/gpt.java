import java.util.Random;


public class gpt {
   

    public static void main(String[] args) {
          int arr[][]=new int[3][4];
          Random r=new Random();
         
         //populating matrix with numbers 
          for(int n[]:arr){
            for(int i=0;i< n.length;i++){
                n[i]=r.nextInt(10);//random values assigned to matrix which ranges from 0-9
            }
          }

          for(int n[]:arr){
            for(int m:n){
                System.out.print(m+ " ");

            }
         System.out.println();  
        }
       
       System.out.println();
       
        for(int c[]:arr){
            for(int j=0;j< c.length;j++){
                c[j]=r.nextInt(100);//random values assigned to matrix which ranges from 0-99
            }
          }

          for(int n[]:arr){
            for(int v:n){

                System.out.print(v+ " ");

            }
         System.out.println();  
        }

   System.out.println();

   for(int x[]:arr){
    for(int i=0;i< x.length;i++){
        x[i]=r.nextInt(1000);//random values assigned to matrix which ranges from 0-9
    }
  }

  for(int n[]:arr){
    for(int m:n){
        System.out.print(m+ " ");

    }
 System.out.println();  
}


        }
    }


