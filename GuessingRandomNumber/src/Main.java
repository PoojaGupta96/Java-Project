
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int userNumber;
        Scanner sc= new Scanner(System.in);
        int myNumber= (int)(Math.random()*100);
do{
    System.out.println("Guess my Number:");
   userNumber= sc.nextInt();

    if(userNumber == myNumber ){
        System.out.println("Hurray! You guessed it right");
        break;
    }
        else if(userNumber > myNumber) {
        System.out.println("You guessed large number");
    }
        else{
        System.out.println("You guessed small number");
    }

}while(userNumber >= 0);
        System.out.println("My number was:");
        System.out.println(myNumber);
    }
}