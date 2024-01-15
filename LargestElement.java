public class LargestElement {
	public static void main(String[] args) {
		
		int [] numbers = {10,40,60,20,30};
		int largest = integer.INT_VALUE;

		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > largest) {
				largest = numbers[index];
			}

		}
		
		System.out.printf("The largest element in the array is %d", largest);

	}

}