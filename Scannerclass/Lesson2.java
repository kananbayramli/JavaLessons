package Scannerclass;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        if (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("Your number is: "+num);
        }
        else{
            System.out.println("Please enter a integer number!");
        }
    }
}
