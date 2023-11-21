import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int num1 = userInput.nextInt();

	System.out.print("Enter second number: ");
	int num2 = userInput.nextInt();

	int cubicSquare = num1 * num1 * num1;
	System.out.printf("The first number when trippled is: %d%n", cubicSquare);

	int square = num2 * num2;
	System.out.printf("The second number when doubled is: %d%n", square);
	
	if (cubicSquare % square == 0){
		System.out.printf("%d is a multiple of %d", cubicSquare, square);
	}

	if (cubicSquare % square != 0){
		System.out.printf("%d is not a multiple of %d", cubicSquare, square);
	}	



	}



}