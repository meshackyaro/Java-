import java.util.Scanner;

public class Arithmetic{
public static void main(String[] args){

Scanner userInput;
userInput = new Scanner(System.in);
System.out.print("Prompt the user to enter firtst integer: ");

int newNumber1 = userInput.nextInt();
System.out.print("Prompt the user to input second integer: ");

int newNumber2;
newNumber2 = userInput.nextInt();

int squared1 = newNumber1 * newNumber1;
System.out.println("The square of the first integer is: " + squared1);

int squared2 = newNumber2 * newNumber2;
System.out.println("The square of the second integer is: " + squared2);

int sumOfSquares = squared1 + squared2;
System.out.println("The sum of the squares of the integers is: " + sumOfSquares);

int diffOfSquares = squared1 - squared2;
System.out.println("The difference of the squares of the integers is: " + diffOfSquares);


}



}