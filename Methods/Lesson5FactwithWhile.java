package Methods;

import java.util.Scanner;

public class Lesson5FactwithWhile {
    
    public static void factorial(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int fact = 1;
        
        while (number > 0){
        
            fact*=number;
            number --;
            
        }
        System.out.println("Factorial is: "+ fact);
    }
    
    
    public static void main(String[] args) {
        factorial();
    }
    
}
