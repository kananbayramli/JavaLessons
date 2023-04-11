package BreakAndContinue;

import java.util.Scanner;

public class FaizProqrami {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Xosh geldiniz. Bizim bankda faiz derecesi 6% teshkil edir.");
        
        int money, year;
        
        System.out.println("Yatirmag istediyiniz meblegi qeyd edin: ");
        money = sc.nextInt();
        
        
        System.out.println("Pulunuzu nece il muddetine yatirmagi fikirleshirsiniz?");
        year = sc.nextInt();
        
        double toplam_mebleg = money;
        double faiz_nisbeti = 0.06;
        
        for (int i = 1; i <= year; i++){
        
            toplam_mebleg = (toplam_mebleg*faiz_nisbeti) + toplam_mebleg;
            System.out.println(i+". ilin sonunda sizin mebleg "+ toplam_mebleg);
            
        }
                
    }
    
}
