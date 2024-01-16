import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter A String: ");
	String userInput = input.next();

	palindromeChecker(userInput);

	}


	
	public static void palindromeChecker(String numberString ) {
	
	String palindrome ="";
	
	int value = numberString.length();



	for (int count = value-1; count >= 0; count--) {

	    palindrome += "" + numberString.charAt(count);

	}

	
	if (palindrome.equals(numberString)) {

	    System.out.print(numberString + " is a palindrome ");
	}

	else {

	    System.out.print(numberString + " is not  a palindrome ");

	}

	}    

}