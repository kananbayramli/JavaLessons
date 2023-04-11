package BreakAndContinue;


public class DangerContinueWIthWhile {
    
    public static void main(String[] args) {
        
        int i = 0;
        
        while (i < 10){
            
        if (i == 3 || i == 10){
            i ++;         // Bu artirilma yazilmadigda, sonsuz dongu yaradir continue;
            continue;    // CUnki fordan ferqli olaraq whileda artilima avtomatik getmir;
        }
        
        System.out.println("i = "+i);
        i ++;
        
        }
    }
    
}
