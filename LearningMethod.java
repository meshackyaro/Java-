public class LearningMethod{

	static int total = 0;

	public static void main(String[] args){
		sum(2, 2);
		sum(3, 3);
		sum(5, 5);


	}

	private static void sum(int num1, int num2){

	total = num1 + num2;
	System.out.println(total);


	}

}

