package Conditionifelse;

import java.util.Scanner;

public class Lesson1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        
        if (a > 18){
            System.out.println("You can buy this product!");
        }else{
            System.out.println("You can't buy this product!!!");
        }
              
    }
}
