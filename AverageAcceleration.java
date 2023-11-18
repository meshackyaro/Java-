import java.util.Scanner;

public class AverageAcceleration{
public static void main(String[] args){

Scanner work = new Scanner(System.in);
System.out.print("Enter starting velocity: ");
float initialVelocity = work.nextFloat();

System.out.print("Enter ending velocity: ");
float finalVelocity = work.nextFloat();

System.out.print("Enter the time speed changes: ");
float time = work.nextFloat();

float difference = finalVelocity - initialVelocity;
 float result = difference/time;
System.out.println("difference: " + result);





}





}