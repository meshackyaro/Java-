import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive number between 1 and 20: ");
	int userInput = input.nextInt();
	
	long total = 1;

	for (int count = 1; count <= userInput; count++) {
	    total *= count;
	}

	System.out.printf("The factorial of %d is %d", userInput, total);
	    
    }

}