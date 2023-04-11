package Scannerclass;

import java.util.Scanner;

public class MIniproject4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        
        System.out.print("Birinci teref: ");
        a = sc.nextInt();
        
        System.out.print("Ikinci teref: ");
        b = sc.nextInt();
        
        double h = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenus is: " + h);    
        
    }
        
}
