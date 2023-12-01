import java.util.Scanner;
public class AbsoluteValue{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter an integer: ");	
	int absoluteNumber = userInput.nextInt();
	
	int number = 0;
	
	if (absoluteNumber > 0){
		int distance = absoluteNumber - 0;
	System.out.println("The distance from number to absolute number is " + distance);
	}else{
		if (absoluteNumber < 0){
			int distance = absoluteNumber * (-1);
	System.out.print("The distance from number to absolute number is " + distance);
	}
	}

	}


}