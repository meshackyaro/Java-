import java.util.Scanner;
public class SeparatingDigits{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter five digit number: ");
	int digits = input.nextInt();

	int num1 = digits / 10000;
	int num2 = (digits // 10000) / 1000;
	int num3 = (digits // 1000) / 100;
	int num4 = (digits // 100) / 10;
	int num5 = digits // 10;

	System.out.printf("%d\t %d\t %d\t %d\t %d\t", num1, num2, num3, num4, num5);
		


	}




}