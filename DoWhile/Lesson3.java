package DoWhile;

import java.util.Scanner;

public class Lesson3 {
    
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("ENter a number: ");
            
            int a = sc.nextInt();
            int b = 0;
            
            
            do{ 
               b +=  a % 10;
               a /= 10;
            }
            
            while (a>0);
            System.out.println("Reqemlerin toplami = "+b);

         
    }
      
}
