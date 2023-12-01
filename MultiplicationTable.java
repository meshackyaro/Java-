import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number from 1 to 10: ");
	int number = scanner.nextInt();

	int count = 1;
if (number > 1 && number < 10){
while (count <= 12){
		int product = number * count;
			System.out.printf("%d x %d = %d\n", number, count, product);
		count++;
	}

	}else{
		System.out.print("Invalid input!");
	}	


}




}