import java.util.Scanner;

public class ExamResults{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int passCount = 0;
		int failCount = 0;
		int counter = 1;

		while (counter <= 10) {
			System.out.print("Enter results (1 for pass, 2 for fail): ");
			int result = input.nextInt();
	
			if (result == 1) {
				passCount = passCount + 1;
			}
			else if (result == 2) {
				failCount = failCount + 1;
			}
			else{
				System.out.println("Invalid input!");
                                   break;
			}
		}

		System.out.printf("Number of passes: %d%nNumber of failures: %d%n", passCount, failCount);

		if (passCount > 8) {
			System.out.printf("Bonus to instructor!");
		}

	}

}