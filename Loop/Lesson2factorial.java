package Loop;

import java.util.Scanner;

public class Lesson2factorial {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int a = 1;
        
        for(int i = 1; number >= i; i++){
            a*=i;
        }
        
        System.out.println("Factorial is: "+a);
    
    }

}

