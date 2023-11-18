import java.util.Scanner;

public class Integers{
public static void main(String[] args){

Scanner inputNumber = new Scanner(System.in);

System.out.print("Prompt the user to input first number: ");
int Num1;
Num1 = inputNumber.nextInt();

System.out.print("Prompt the user to input second number: ");
int Num2 = inputNumber.nextInt();

System.out.print("Prompt the user to input third number: ");
int Num3;
Num3 = inputNumber.nextInt();

int totalSum = Num1 + Num2 + Num3;

System.out.println("The total of three integers is: " + totalSum);

int average = totalSum / 3;
System.out.println("the average of the three integers  is: " + average);

}


}