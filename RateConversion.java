import java.util.Scanner;

public class RateConversion{
public static void main(String[] args){

Scanner exchange = new Scanner(System.in);

System.out.print("Enter exchange rate: ");
double rate = exchange.nextDouble();

System.out.print("Enter 0 to convert USD to Yuan or 1 to convert Yuan to USD: ");
int Number = exchange.nextInt();

if (Number == 0){
System.out.print("Enter amount in USD: "); 

double american = exchange.nextDouble();

double convertedYuan = rate * american;
System.out.printf("%.2f Rate in Yuan: %.2f",american, convertedYuan);
}

if (Number == 1){
System.out.print("Enter amount in Yuan: ");

double chinese = exchange.nextDouble();

double convertedDollars = chinese / rate;
System.out.printf("%.2f Rate in USD: $%.2f", chinese, convertedDollars);
}


}




}