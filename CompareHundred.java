import java.util.Scanner;
public class CompareHundred{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int integer = input.nextInt();

		int square = integer * integer;

		if (integer == 100){
			System.out.printf("%d is equal to 100 %n", integer, 100);
		}

		if (integer != 100){
			System.out.printf("%d is not equal to 100 %n", integer);
		}
		
		if (integer > 100){
			System.out.printf("%d is greater than 100 %n", integer);
		}

		if (integer < 100){
			System.out.printf("%d is less than 100 %n", integer);
		}
		
		if (square == 100){
			System.out.printf("%d is equal to 100 %n", square);
		}

		if (square != 100){
			System.out.printf("%d is not equal to 100 %n", square);
		}

		if (square > 100){
			System.out.printf("%d is greater than 100 %n", square);
		}

		if (square < 100){
			System.out.printf("%d is less than 100 %n", square);
		}

	}

}