import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n; 
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int height[]= new int[n];
        int maxht=0;
        for (int i = 0; i < n; i++) {
            height[i] = s.nextInt();
            if (height[i] > maxht) {
                maxht = height[i];

            }
        }
        for(int r=maxht;r>0;r--){
            for (int c = 0; c < n; c++) {
                if (height[c] >= r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        
            }

            System.out.println();
    }


    }
}    
    
