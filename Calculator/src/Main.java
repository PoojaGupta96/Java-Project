import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Try our calculator");
 Scanner sc= new Scanner(System.in);
 while(true){
     System.out.println("Choose the operator");
     System.out.println("1. Addition (+)");
     System.out.println("2. Subtraction (-)");
     System.out.println("3. Multiplication (*)");
     System.out.println("4. Division (/)");
     System.out.println("5. Exit");
     System.out.println("Your choice (1-5)");
     int choice= sc.nextInt();
     if(choice == 5){
         System.out.println("Exit");
         break;
     }
     System.out.println("Enter your 1st number:");
     double num1=sc.nextDouble();
     System.out.println("Enter your 2nd number");
     double num2=sc.nextDouble();
     switch(choice){
         case 1:
             System.out.println("Result:"+ (num1+num2));
             break;
         case 2:
             System.out.println("Result:"+(num1-num2));
             break;
         case 3:
             System.out.println("Result:"+ (num1*num2));
             break;
         case 4:
             if(num2 !=0){
                 System.out.println("Result:"+ (num1/num2));
             }
             else{
                 System.out.println("Error");
             }
             break;
         default:
             System.out.println("Error");
     }
 }
    }
}