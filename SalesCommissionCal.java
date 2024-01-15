import java.util.Scanner;
public class SalesCommissionCal{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		double value = 0;
		double weeklyPay = 200;
		double bonus = 0.09;
		

		while (value != -1.0) {
		
			
			System.out.println("Enter item value: ");
			value = input.nextDouble();
			
			double newValue = (value *  bonus) + weeklyPay;
			System.out.printf("Gross pay for salesperson is: $%.2f%n", newValue);
			
		}

	}

}