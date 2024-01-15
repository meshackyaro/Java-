import java.util.Scanner;
public class MinimumAndMaximum {
    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	int max = 0;
	int sum = 0;

	System.out.println("Enter a number: ");
	int min = input.nextInt();
	
	for (int count = 1; count < 5; count++) {
	    System.out.println("Enter next number: ");
	    int number = input.nextInt();
	    

	    if (number > max) {
		max = number;
	 
	    }
	    if (number < min) {
		
		min = number;
	    }

	}
	   System.out.println("The maximum number is " + max);
	   System.out.println("The mininimum number is " + min);
    }

}