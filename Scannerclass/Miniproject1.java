package Scannerclass;

import java.util.Scanner;

public class Miniproject1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your kq: ");
        int kq = sc.nextInt();
        
        System.out.print("Enter your tall: ");
        double boy = sc.nextDouble();
        
        System.out.println("Your index: "+(kq/(boy*boy)));
        
    }
}
