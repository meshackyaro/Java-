import java.util.Scanner;
public class DisplayAge {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter enter your year of birth: ");
	int year = input.nextInt();

	System.out.print("Enter enter current year: ");
	int currentYear = input.nextInt();
	
	int age = currentYear - year;

	System.out.println("You are " + age + " years old");


    }

}