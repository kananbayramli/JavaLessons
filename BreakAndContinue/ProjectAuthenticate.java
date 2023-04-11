package BreakAndContinue;

import java.util.Scanner;

public class ProjectAuthenticate {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name = "Kanan Bayramli";
        String password = "kenan1995";
        int popitka = 3;
        
        
        while(true){
            
            System.out.print("Enter your username: ");
            String name_sys = sc.nextLine();
            System.out.print("Enter your password");
            String password_sys = sc.nextLine();
            
            if(name_sys.equals(name) && password_sys.equals(password)){
                System.out.println("Wellcome to our site!");
                break;
            }
            else if(name_sys.equals(name) && !password_sys.equals(password)){
                System.out.println("Your password is uncorrect! Try again!");
                popitka --;
            }
            else if(!name_sys.equals(name) && password_sys.equals(password)){
                System.out.println("Your username is uncorrect! Please write correctly!");
                popitka --;
            }
            else{
                System.out.println("Your username and password is uncorrect!");
                popitka --;
                System.out.println("You hava "+popitka+"chance");
            }
            
            if (popitka == 0){
                System.out.println("Vi potratili vse popitki! Goodbye");
                break;
            }
            
        }    
        
    }
      
}
