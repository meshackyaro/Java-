import java.util.Scanner;
public class ComparingTwoIntegers{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);

			System.out.print("Enter first integer: ");
		int integer1 = userInput.nextInt();

			System.out.print("Enter second integer: ");
		int integer2 = userInput.nextInt();

		if (integer1 == integer2){
			System.out.printf("%d == %d%n", integer1, integer2);
		}

		if (integer1 != integer2){
			System.out.printf("%d != %d%n", integer1, integer2);
		}
 	
		if (integer1 > integer2){
			System.out.printf("%d > %d%n", integer1, integer2);
		}

		if (integer1 < integer2){
			System.out.printf("%d <%d%n", integer1, integer2);
		}

		if (integer1 >= integer2){
			System.out.printf("%d >= %d%n", integer1, integer2);
		}

		if (integer1 <= integer2){
			System.out.printf("%d <= %d%n", integer1, integer2);
		}


	}




}