import java.util.Scanner;
public class LargestAndSmallestIntegers{
	public static void main(String[] args){
	
	Scanner integers = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = integers.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = integers.nextInt();

	System.out.print("Enter third integer: ");
	int num3 = integers.nextInt();

	System.out.print("Enter fourth integer: ");
	int num4 = integers.nextInt();

	System.out.print("Enter fifth integer: ");
	int num5 = integers.nextInt();

	int largest = 0;
	int smallest = num2;

	if (num1 > largest){
		largest = num1;
	}

	if (num2 > largest){
		largest = num2;
	}

	if (num3 > largest){
		largest = num3;
	}

	if (num4 > largest){
		largest = num4;
	}

	if (num5 > largest){
		largest = num5;
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

	if (num4 < smallest){
		smallest = num4;
	}

	if (num5 < smallest){
		smallest = num5;
	}
	
	System.out.printf("%d is the largest integer while %d is the smallest integer", largest, smallest);
	
	}




}