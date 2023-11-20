import java.util.Scanner;
public class SmallestAndLargest{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int num1 = scanner.nextInt();

	System.out.print("Enter second number: ");
	int num2 = scanner.nextInt();

	System.out.print("Enter third number: ");
	int num3 = scanner.nextInt();

	int sum = num1 + num2 + num3;
	System.out.println("The sum of the three numbers is: " + sum);

	int average = sum / 3;
	System.out.printf("The average of the three numbers is: %d%n ", average);

	int product = num1 * num2 * num3;
	System.out.println("The product of the three numbers is: "+product);

	int largest = 0;
	int smallest = num3;

	if (num1 > largest){
		largest = num1;
	}

	if (num2 > largest){
		largest = num2;
	}

	if (num3 > largest){
		largest = num3;
	}

	if (num1 < smallest){
		smallest = num1;
	}

	if (num2 < smallest){
		smallest = num2;
	}
	if (num3 < smallest){
		smallest = num3;
	}
	System.out.println(largest+ " is the largest number while " +smallest+ " is the smallest number");
	System.out.printf("%d is the largest number while %d is the smallest number",largest,smallest);
	}




}