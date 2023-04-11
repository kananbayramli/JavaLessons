package BreakAndContinue;

import java.util.Scanner;

public class MiniProjectArmstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Pille sayini qeyd edin: ");
        int pilleler = sc.nextInt();
        
        int kecid_num = num;
        int toplam = 0;
        
        do{
            int pille = kecid_num % 10;
            kecid_num /= 10;
            
            toplam += Math.pow(pille, pilleler);
            
        }
        while(kecid_num > 0);
        
        if (num == toplam)
        {
            System.out.println("This is a armstrong number!");
        }
        else{
            System.out.println("This is not armstrong number!");
        }
        
    }      
    
}
