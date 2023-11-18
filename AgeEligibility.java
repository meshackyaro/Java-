import java.util.Scanner;
public class AgeEligibility{
public static void main(String[] args){

Scanner age = new Scanner(System.in);

System.out.print("Enter your age: ");
int old = age.nextInt();

if (old >= 18){
System.out.print("Eligible");
}
if (old < 18){
System.out.print("Not Eligible");
}



}



}