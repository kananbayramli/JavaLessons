package DoWhile;

import java.util.Scanner;

public class Lesson2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int a = sc.nextInt();
        int b = 0;
        
        do{
            System.out.println("a = "+a);
            a--;            
            b+=a+1;
        }
        
        
        while(0 < a);  
        System.out.println("b = "+b);
    }
    
    
}
