import java.util.Scanner;
public class PerimeterOfATriangle{
	public static void main(String[] args){
	
	Scanner triangle = new Scanner(System.in);

	System.out.print("Enter first edge: ");
		int edge1 = triangle.nextInt();
	
	System.out.print("Enter second edge: ");
		int edge2 =  triangle.nextInt();
	
	System.out.print("Enter third edge: ");
		int edge3 = triangle.nextInt();

	int sum1 = edge1 + edge2;
	int sum2 = edge2 + edge3;
	int sum3 = edge3 + edge1;


	if (sum1 > edge3 && sum2 > edge1 && sum3 > edge2){
		int perimeter = edge1 + edge2 + edge3;
			System.out.printf("the perimeter is %d", perimeter);
	}
	else{
		System.out.print("Input is invalid");
	}



}




}