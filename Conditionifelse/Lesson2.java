package Conditionifelse;

import java.util.Scanner;

public class Lesson2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your note: ");
        double note = sc.nextDouble();
        
        if (note < 5){
            System.out.println("You very lazy!");
        }else if(note < 8){
            System.out.println("You can do very much!");
        }else if(note < 10){
            System.out.println("Good.Keep learning!");
        }else{
            System.out.println("Invalid operation!");
        }      
    }
    
}
