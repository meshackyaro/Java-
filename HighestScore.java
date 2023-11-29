import java.util.Scanner;
public class HighestScore{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number of students: ");
	int numberOfStudent = input.nextInt();

	int score = 0;
	int highestScore = 0;
	String highestScorer = "";
	int count = 0;

while (count < numberOfStudent){
	System.out.print("Enter students name: ");
	String nameOfStudent = input.next();
	
	System.out.print("Enter students score: ");
	score = input.nextInt();
	
	if(score > highestScore ){
		highestScorer = nameOfStudent;
		highestScore = score;
		
	}
	count++;
	}

	System.out.printf("Highest scorer is: %s%n", highestScorer);
	System.out.printf("Score is: %d%n", highestScore);
	}

}