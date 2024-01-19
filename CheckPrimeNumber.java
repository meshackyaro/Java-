import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive number: ");
	int userInput = input.nextInt();

	int counter = 0;

	for (int count = 2; count <= userInput/2; count++) {
	
	    if (userInput % count == 0) {

		counter++;
	    }

	}

	if (counter > 0) {

	System.out.printf("%d Is Not A Prime Number", userInput);

	}

	else {

	    System.out.printf("%d Is A Prime Number", userInput);

	}

    }

}