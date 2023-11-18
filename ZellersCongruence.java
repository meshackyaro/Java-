import java.util.Scanner;
public class ZellersCongruence{
public static void main(String[] args){

Scanner zeller = new Scanner(System.in);

System.out.print("Enter month: ");
int month = zeller.nextInt();

System.out.print("Enter year: ");
int year = zeller.nextInt();

System.out.print("Enter days: ");
int day = zeller.nextInt();

int jubilee = 26 * (month + 1) / 10;
int year1 = year % 100;
int century = year / 100;
int year2 = year1 / 4;
int century2 = century / 4;
int century3 = 5 * century;

int daysOfTheWeek = (day + jubilee + year1 + year2 +century2 + century3) % 7;


if(daysOfTheWeek == 0){
System.out.print("Day of the week is Saturday");
}

if(daysOfTheWeek == 1){
System.out.print("Day of the week is Sunday");
}

if(daysOfTheWeek == 2){
System. out.print("Day of the week is Monday");
}

if(daysOfTheWeek == 3){
System.out.print("Day of the week is Tuesday");
}

if(daysOfTheWeek == 4){
System.out.print("Day of the week is Wednesday");
}

if(daysOfTheWeek == 5){
System.out.print("Day of the week is Thursday");
}

if(daysOfTheWeek == 6){
System.out.print("Day of the week is Friday");
}



}


}