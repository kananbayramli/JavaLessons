package SwitchCase;

import java.util.Scanner;

public class Lesson1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your note: ");
        int note = sc.nextInt();
        
        switch(note){
            case 2:
                System.out.println("pis");
                break;
            case 3:
                System.out.println("pis + ");
                break;
            case 4:
                System.out.println("orta");
                break;
            case 5:
                System.out.println("Ela");
                break;
            default:
                System.out.println("Invalid operation!");
                
        }
        
    }
    
}
