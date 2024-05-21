
//this is a small project in java trying to create a simple interest calculator
import java.util.Scanner;
public class SimpleInterestCalculator {
    //create a scanner object
    public static void main(String[] args) {
       

        //create principal amount
        Scanner myobject = new Scanner(System.in);
        //create principalvalue
        System.out.println("Enter the principal value: ");

        double PrincipalValue = myobject.nextDouble();
        System.out.println("The principal amount is " + PrincipalValue + "$");

        //create  rate 
        System.out.println("Enter the rate: ");
        int Rate = myobject.nextInt();
        System.out.println("The rate is " + Rate + " %");
        //calculate simple interest
        
        
        System.out.println("Enter the time: ");
        double Time = myobject.nextDouble();
        System.out.println("The time is " + Time + " years");

        double Interest = (PrincipalValue * Rate * Time) / 100;
        System.out.println("The interest is " + Interest + "$");

        double TotalAmount = (PrincipalValue + Interest);
        System.out.println("The total amount is " + TotalAmount + "$");
    }
} 