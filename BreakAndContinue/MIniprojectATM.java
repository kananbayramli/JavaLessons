package BreakAndContinue;

import java.util.Scanner;

public class MIniprojectATM {
    
    public static void main(String[] args) {
     
        String islem = "1. Hesabdaki mebleg: \n"
                + "2. Pul cekmek:\n"
                + "3. Pul yuklemek:\n"
                + "Cixish ucun q-e basin!";      
        System.out.println("************************");
        System.out.println(islem);
        System.out.println("************************");
        
        
        Scanner sc = new Scanner(System.in);
        int balans = 100;
        
        
        while (true){
            
            System.out.print("Emeliyyati sira nomresine uygun secin: ");
            String ish = sc.nextLine();

        
            if (ish.equals("q")){
                System.out.println("Sistemden cixilir!");
                break;
            }
            else if(ish.equals("1")){
                System.out.println("Szin balansdaki mebleq: "+balans);
            }
            else if(ish.equals("2")){
                System.out.println("Cekmek istediyiniz meblegi qeyd edin: ");
                int mebleg = sc.nextInt();
                sc.nextLine();
                
                if (mebleg > balans){            
                    System.out.println("Kifayet qeder mebleg yoxudr! Balansiniz: "+balans);
                }else{
                    balans -= mebleg;
                    System.out.println("Yeni balansiniz: "+balans);
                }
            }
            else if(ish.equals("3")){
                System.out.println("Elave etmek istediyiniz meblegi qeyd edin: ");
                int mebleg = sc.nextInt();
                sc.nextLine();
                
                balans += mebleg;
                System.out.println("Yeni balansiniz: "+ balans);
                
            }
            else{
                System.out.println("Invalid operation!");
            }        
            
        }
        
    }
    
}
