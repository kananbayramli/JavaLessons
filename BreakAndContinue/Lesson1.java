package BreakAndContinue;

import java.util.Scanner;

public class Lesson1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        
        int password = 1234;
        int passw = sc.nextInt();
        
        while (passw == password){
            
                System.out.println("Wellcome");
                break;
            
        }
        if (passw != password){
                    System.out.println("Girilimish shifre yanlishdir!");
                }     
        
    }
}
