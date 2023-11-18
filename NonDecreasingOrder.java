import java.util.Scanner;
public class NonDecreasingOrder{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second number: ");
int num2 = input.nextInt();

System.out.print("Enter third integer: ");
int num3 = input.nextInt();

int highest = 0;
int middle = 0;
int lowest = num3;

if (num1 > highest){
	highest = num1;
}

if (num2 > highest){
	highest = num2;
}

if (num3 > highest){
	highest = num3;
}

if (num1 < lowest){
	lowest = num1;
}

if (num2 < lowest){
	lowest = num2;
}

if (num3 < lowest){
	lowest = num3;
}
if (num1 < highest && num1 > lowest){
	middle = num1;
}

if (num2 < highest && num2 > lowest){
	middle = num2;
}

if (num3 < highest && num3 > lowest){
	middle = num3;
}

System.out.printf("%d %d %d", lowest, middle, highest);



}


}