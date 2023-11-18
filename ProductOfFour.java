import java.util.Scanner;

public class ProductOfFour{
public static void main(String[] args){

Scanner product = new Scanner(System.in);
System.out.print("enter first number");
int firstNumber = product.nextInt();

System.out.print("enter second number");
int secondNumber = product.nextInt();

System.out.print("enter third number");
int thirdNumber = product.nextInt();

System.out.print("enter fourth");
int fourthNumber = product.nextInt();

int productOfNumbers = firstNumber * secondNumber * thirdNumber * fourthNumber;
System.out.print(productOfNumbers);


}





}