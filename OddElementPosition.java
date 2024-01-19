public class OddElementPosition {

    public static int returnOddPosition(int [] elements) {
  	int oddPosition = 0;

	    System.out.print("The Odd Element Positions Are: ");
	for (int index = 0; index < elements.length; index += 2) {
	    System.out.print(elements[index] + " ");
	}

	return oddPosition;

    }



public static void main(String[] args) {

    int [] numbers = {1,2,3,4,5};

    returnOddPosition(numbers);
}
  
}