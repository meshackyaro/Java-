import java.util.Scanner;

public class PoundsToKilogram{
public static void main(String[] args){

Scanner pounds = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");
int userInput = pounds.nextInt();

double result = userInput * 0.454;
System.out.printf("Pounds to kilograms is:  %.3f", result);



}


}