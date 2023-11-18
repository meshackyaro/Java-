import java.util.Scanner;
public class PaperScissorsRock{
public static void main(String[] args){

Scanner bird = new Scanner(System.in);

System.out.print("Enter first player name: ");
String Player1 = bird.nextLine();

System.out.print("Enter second player name: ");
String Player2 = bird.nextLine();

System.out.println("Scissors = 1	Paper = 1	Rock = 0");

System.out.print("Prompt player1 to enter a number: ");
int Number1 = bird.nextInt();

System.out.print("Prompt player2 to enter a number: ");
int Number2 = bird.nextInt();

if (Number1 == 0 && Number2 == 1){
System.out.printf("%s wins", Player1);
}

if (Number1 == 1 && Number2 == 2){
System.out.printf("%s wins", Player1);
}

if (Number1 == 2 && Number2 == 0){
System.out.printf("%s wins", Player1);
}

if (Number1 == 1 && Number2 == 0){
System.out.printf("%s wins", Player2);
}

if (Number1 == 2 && Number2 == 1){
System.out.printf("%s wins", Player2);
}

if (Number1 == 0 && Number2 == 2){
System.out.printf("%s wins", Player2);
}

if (Number1 == 0 && Number2 == 0){
System.out.printf("Draw");
}

if (Number1 == 1 && Number2 == 1){
System.out.printf("Draw");
}

if (Number1 == 2 && Number2 == 2){
System.out.printf("Draw");
}



}



}