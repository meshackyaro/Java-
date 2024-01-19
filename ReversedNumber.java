import java.util.Scanner;
public class ReversedNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a five digit number: ");
	int number = input.nextInt();

	if (number < 9999 && number > 99999) {

	    int number1 = number / 10000;
	    int number2 = number / 1000 % 10;
	    int number3 = number / 100 % 10;
	    int number4 = number / 10 % 10;
	    int number5 = number % 10;

	    System.out.printf("%d%d%d%d%d", number5, number4, number3, number2, number1);

	}

	else {

	    System.out.print("Invalid input. Please, enter a five digit number");

	}

    }

}