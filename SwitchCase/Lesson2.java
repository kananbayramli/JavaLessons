package SwitchCase;

import java.util.Scanner;

public class Lesson2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String islemler = "1. Toplama emeliyyati ucun\n"
                          +"2. Cixma emeliyyati ucun\n"
                          +"3. Vurma emeliyyati ucun\n"
                          +"4. Bolme emeliyyati ucun\n";   
        System.out.println("***********************");
        System.out.println("Emeliyyati secin: \n" + islemler);
        System.out.println("***********************");

        
        System.out.print("Buraya emeliyyat nomresini qeyd edin: --> ");
        int eml = sc.nextInt();
        

        System.out.print("Enter first number: "); 
        double num = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num1 = sc.nextDouble();
        
        switch(eml){
        
            case 1:
                System.out.println("Ededlerin toplanma deyeri: "+(num + num1));
                break;
            case 2:
                System.out.println("Ededlerin cixilmasindan alinan deyer: "+(num-num1));
                break;
            case 3:
                System.out.println("Ededlerin hasili: "+(num*num1));
                break;
            case 4:
                System.out.println("Edelerin bolunmesinden alinan deyer: "+(num/num1));
                break;
            default:
                System.out.println("Invalid operation");
        }
               
    }       
    
}
