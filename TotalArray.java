import java.util.Arrays;
public class TotalArray {
    public static void main(String[] args) {

	int total = 0;
	int [] arrays = {1,2,3,4,5,6,7,8,9,10};

	for (int index = 0; index < arrays.length; index++) {
	    total += index;

	}
	System.out.printf("The total of the running array is: %d", total);

   }

}