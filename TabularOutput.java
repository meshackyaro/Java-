public class TabularOutput{

	public static void main(String[] args){
		int counter = 1;
		
		System.out.println("N	N2	N3	N4");
		while (counter <= 5) {
                  int value = counter;
                  int value1 = counter*counter;
                  int value2 = counter*counter*counter;
                  int value3 = counter*counter*counter*counter;
		 
		System.out.printf ("%d	%d	%d	%d	%n", value, value1, value2, value3);
			counter++;
			

		}

	}

}


