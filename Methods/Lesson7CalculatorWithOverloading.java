package Methods;

import java.util.Scanner;

public class Lesson7CalculatorWithOverloading {
    
    public static int toplam(int a, int b){
        return a+b;
    }
    
    public static int toplam(int a, int b, int c){
        return a+b+c;
    }
    
    public static double bolme(int a, int b){
        return (double)a/b;
    }
    
    public static int vurma(int a, int b, int c){
        return a*b*c;
    }
    
    public static int vurma(int a, int b){
        return a*b;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String pros = "1. Toplama emeliyyati: \n"
                + "2. Bolme emeliyyati: \n"
                + "3. Vurma emeliyyati: \n"
                + "q. Sistemnen cixilir!";
        System.out.println("*****************");
        System.out.println(pros);
        System.out.println("*****************");
      
        
        while(true){
        System.out.println("Choose the process: ");
        String process = sc.nextLine();
        
        if (process.equals("q")){
            System.out.println("Sistemden cixilir!...");
            break;
        }
        else if(process.equals("1")){
            System.out.print("How many value do you want plus? (2 or 3) : ");
            int nums = sc.nextInt();
            
            if(nums == 2){
                System.out.print("First number: ");
                int a = sc.nextInt();
                System.out.print("Second number: ");
                int b = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Toplam deyer: "+(toplam(a,b)));
                
            }
            else if (nums == 3){
                System.out.print("First number: ");
                int a = sc.nextInt();
                System.out.print("Second number: ");
                int b = sc.nextInt();
                System.out.print("Third number: ");
                int c = sc.nextInt();
                sc.nextLine();

                
                System.out.println("Toplam deyer: "+(toplam(a,b,c)));
            
            }
            else{
                System.out.println("Dont find this process!");
            }
        }
        else if (process.equals("2")){
        
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Bolmeden alinan cavab: "+(bolme(a, b)));
        }
        else if (process.equals("3")){
        
            System.out.print("How many value do you want multiplication? (2 or 3): ");
            int num1 = sc.nextInt();
            
            if (num1 == 2){
            
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Answer is: "+(vurma(a,b)));
                
            }
            else if(num1 == 3){
            
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                
                System.out.print("Enter third number: ");
                int c = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Answer is: "+(vurma(a,b,c)));
            }
            else{
            
                System.out.println("Dont find this process!");
            }
            
        }
        
      }
    }
      
}
