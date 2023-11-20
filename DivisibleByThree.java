import java.util.Scanner;
public class DivisibleByThree{
	public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter integer: ");
	int digit = userInput.nextInt();

	if (digit % 3 == 0){
		System.out.print("It is divisible by 3");
	}

       if (digit % 3 != 0){
		System.out.print("It is not divisible by 3");
	}


	
	}	




}