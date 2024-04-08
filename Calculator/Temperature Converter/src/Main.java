import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius ");
        System.out.println("5. Fahrenheit to Kelvin ");
        System.out.println("6. Kelvin to Fahrenheit ");
        System.out.println("Your choice:");
        int choice= sc.nextInt();
        double temperature;
        double result;
        switch(choice){
            case 1:
                System.out.println("Enter temperature in Celsius:");
                temperature=sc.nextDouble();
                result= celsiustoFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit:" + result);
                break;

            case 2:
                System.out.println("Temperature in Fahrenheit:");
                temperature=sc.nextDouble();
                result=fahrenheittoCelsius(temperature);
                System.out.println("Temperature in Celsius:"+ result);
                break;

            case 3:
                System.out.println("Temperature in Celsius:");
                temperature=sc.nextDouble();
                result=celsiustoKelvin(temperature);
                System.out.println("Temperature in Kelvin:"+ result);
                break;

            case 4:
                System.out.println("Temperature in Kelvin:");
                temperature= sc.nextDouble();
                result=kelvintoCelsius(temperature);
                System.out.println("Temperature in Celsius:"+ result);
                break;

            case 5:
                System.out.println("Temperature in Fahrenheit:");
                temperature=sc.nextDouble();
                result=fahrenheittoKelvin(temperature);
                System.out.println("Temperature in Kelvin:"+ result);
                break;

            case 6:
                System.out.println("Temperature in Kelvin:");
                temperature= sc.nextDouble();
                result=kelvintoFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit:"+ result);
                break;
            default:
                System.out.println("Error");
        }
    }
    private static double celsiustoFahrenheit(double celsius) {
        return (celsius *9/5)+32;
    }
    private static double fahrenheittoCelsius(double fahrenheit ){
        return (fahrenheit-32)* 5/9;
    }
    private static double celsiustoKelvin(double celsius){
        return celsius + 273.15;
    }
    private static double kelvintoCelsius(double kelvin ){
        return kelvin- 273.15;
    }
    private static double fahrenheittoKelvin(double fahrenheit){
        return (fahrenheit - 32)* 5/9 + 273.15;
    }
    private static double kelvintoFahrenheit(double kelvin){
        return (kelvin - 273.15)* 9/5 +32;
    }
}