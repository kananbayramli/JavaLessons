package Scannerclass;

import java.util.Scanner;

public class Miniproject3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
          
        System.out.print("First number: ");
        a = sc.nextInt();
        
        System.out.print("Second number: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;   
        
        System.out.println("Deyiwmiw deyerler! 1ci deyer: "+a);
        System.out.println("2ci deyer: "+b);
    }
}
