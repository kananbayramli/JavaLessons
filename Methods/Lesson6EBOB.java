package Methods;

import java.util.Scanner;

public class Lesson6EBOB {
    
    public static int ebobTap(int num1, int num2){
    
        int ebob = 1 ;
        
        for(int i= 1; i <= num1 && i <= num2; i++){
        
            if (num1 % i == 0 && num2 % i ==0){
            
                ebob = i;
                
            }
                        
        }
        
        return ebob;
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int say1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int say2 = sc.nextInt();
        
        System.out.println("En boyuk ortag bolunen: "+ebobTap(say1,say2)); 
        
    }
    
}
