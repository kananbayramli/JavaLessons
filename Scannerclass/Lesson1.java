package Scannerclass;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your age: ");
        
        int age = sc.nextInt();
        System.out.println("Your age: "+age);
        
    }
}
