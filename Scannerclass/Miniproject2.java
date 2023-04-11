package Scannerclass;

import java.util.Scanner;

public class Miniproject2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Avtomobilin 100 km-e serf etdiyi benzin: ");
        double benzin = sc.nextDouble();
        
        System.out.print("Avtomobilin serf etmeli oldugu mesafe: ");
        double mesafe = sc.nextDouble();
        
        System.out.println("Size lazim olacag yanacag miqdari: "+(mesafe/benzin));           
        
    }
    
}
