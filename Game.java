import java.util.Scanner;
public class Game{
public static void main(String[] args){

Scanner bird = new Scanner(System.in);

System.out.print("Enter player 1 name: ");
String player1 = bird.nextLine();

System.out.print("Enter player 2 name: ");
String player2 = bird.nextLine();

System.out.printf("Prompt %s to enter a number 0, 1 or 2:", player1);
int num1 = bird.nextInt();

System.out.printf("Prompt %s to enter a number 0,1 or 2:", player2);
int num2 = bird.nextInt();

if (num1 == 0 && num2 == 2){
System.out.printf("%s wins", player1);
}





}





}