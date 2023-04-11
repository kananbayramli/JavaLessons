package WhileLoop;

import java.util.Scanner;

public class Lesson1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int a = 1;
        
        while(number > 0){
           a *= number;
           number --;
        }
        System.out.println(a);
    }
    
}
