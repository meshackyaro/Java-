public class EvenElementPosition {

    public int displayEven(int [] elements) {

	int evenPosition = 0;
		
	    System.out.print("The Even Element Positions Are: ");
	for (int index = 1; index < elements.length; index += 2) {
	    System.out.print(elements[index] + " ");

	}

	return evenPosition;

    }



    public static void main(String[] args) {
	
	EvenElementPosition even = new EvenElementPosition();

	int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	even.displayEven(numbers);


    }



}