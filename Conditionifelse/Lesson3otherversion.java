package Conditionifelse;

import java.util.Scanner;

public class Lesson3otherversion {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        int max_num = -1000; //mojno postavit lyuboe cislo
        
        if (a >= b && a >= c){
            max_num = a;
        }
        else if(b >= a && b >= c){
            max_num = b;
        }
        else{
            max_num = c;
        }
        
        System.out.println("Max number is: "+ max_num);
        
        
    }
    
}
