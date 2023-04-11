package Scannerclass;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your name: ");
        sc.nextLine();  //Dummy
        String name = sc.nextLine();
        System.out.println("Your age is: "+ age);
        System.out.println("Your name is: "+ name);
        
    }
}
