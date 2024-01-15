import java.util.Arrays;
public class ReverseElements {
    public static void main(String[] args) {	

	int newIndex = 0;

	int [] elements = {1,2,3,4,5};
	int [] reverse = new int [elements.length];

	for (int index = elements.length-1; index>= 0; index--) {

		reverse[newIndex] = elements[index];
		newIndex++;

	}

	System.out.println(Arrays.toString(reverse));

    }

}