package Conditionifelse;

import java.util.Scanner;

public class Lesson3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter a another number: ");
        int c = sc.nextInt();
        
        if (a > b && a>c){
            System.out.println("Max number is: "+ a);
        }
        else if(b > a && b > c){
            System.out.println("Max number is: "+b);
        }
        else if(c > a && c > b){
            System.out.println("Max number is: "+ c);
        }
        else{
            System.out.println("Equal is every number"+a);
        }
        
    }
    
}
