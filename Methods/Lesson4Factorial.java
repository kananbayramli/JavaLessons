package Methods;

import java.util.Scanner;

public class Lesson4Factorial {
    
    public static void factorial(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = 1;
        
        for(int i=1; num >= i; i++){
            a*=i;
        }
        System.out.println("Factorial is: "+a);
               
    }
    
    public static void main(String[] args) {
       
        factorial();
        factorial();     
    }
    
}
