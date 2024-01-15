import java.util.Arrays;
public class OddElements {
    public static void main(String[] args) {

	int [] elements = {1,2,3,4,5,6,7,8,9,10};

	for (int index = 1; index < elements.length; index += 2) {
	    System.out.printf("%d ", elements[index]);

	}

    }

}