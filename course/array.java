

public class array 
{
    public static void main(String[] args)
    {
      int arr[][]=new int[4][5];
    
     
      for(int i=0;i<=3;i++)
     
      
        {     
         for(int j=0;j<5;j++)
         {
           arr[i][j]=(int)(Math.random()* 100);//typecasting double to int 
            System.out.print(arr[i][j]+ " ");
            //*math random creates double type value and is less than 1.0*
          /*
           * * @return  a pseudorandom {@code double} greater than or equal
           * to {@code 0.0} and less than {@code 1.0}.
           * @see #nextDown(double)
           * @see Random#nextDouble()
           */
         //public static double random() {
          //  return RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
   }
           
    System.out.println(); 
        }
           
        System.out.println(); 
        /*
           * this is how i make matrix
            first you start loop keep value of rows
            then nested loop for columns
            sopln arrij + " "
            " "to give ap
            and to the main loops print nothing to get matrix structure
           */
        
    
    
 //enhanced loop
    for(int n[]:arr){
      for(int m:n){
       
         System.out.print(m + " ");
      }
    System.out.println();
    }
    System.out.println();
    for(int x[]:arr){
      for(int y:x){
        System.out.print(y+" ");
      }
    System.out.println();
    }

    }
  }