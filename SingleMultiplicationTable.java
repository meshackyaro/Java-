import java.util.Scanner;
public class SingleMultiplicationTable {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number to display its multiplication table: ");
	int userInput = input.nextInt();
	
	for (int count = 1; count <= 12; count++) {
	    
	    int total = userInput * count;

	     System.out.println(userInput + " X " + count + " = " + total);

	}


    }

}