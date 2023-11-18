import java.util.Scanner;
public class MonthsAndYear{
public static void main(String[] args){

Scanner bird = new Scanner(System.in);

System.out.print("Enter month: ");
int month = bird.nextInt();

System.out.print("Enter year: ");
int year = bird.nextInt();

int leapyear = year%4;

if (month == 1){
System.out.printf("%d January has 31 days", year);
}

if (leapyear == 0 && month == 2){
System.out.printf("%d is a leap yarFebruary has 29 days", year);
}
if (leapyear != 0 && month == 2){
System.out.printf("%d February has 28 days", year);
}

if (month == 3){
System.out.printf("%d March has 31 days", year);
}

if (month == 4){
System.out.printf("%d April has 30 days", year);
}

if (month == 5){
System.out.printf("%d May has 31 days", year);
}

if (month == 6){
System.out.printf("%d June has 30 days", year);
}

if (month == 7){
System.out.printf("%d July has 31 days", year);
}

if (month == 8){
System.out.printf("%d August has 31 days", year);
}

if (month == 9){
System.out.printf("%d September has 30 days", year);
}

if (month == 10){
System.out.printf("%d October has 31 days", year);
}

if (month == 11){
System.out.printf("%d November has 30 days", year);
}

if (month == 12){
System.out.printf("%d December has 31 days", year);
}




}




}