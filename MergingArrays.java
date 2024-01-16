import java.util.Arrays;
public  class MergingArrays {
    public static void main (String[] args) {


	int [] arrays1 = {1,2,3,4};
	int [] arrays2 = {5,6,7,8};

	int value1 = arrays1.length;
	int value2 = arrays2.length;
	int value = value1 + value2;

	int [] newArrays = new int [value];

	
	for (int index = 0; index < value1; index++) {
	    newArrays[index] = arrays1[index];
	    
	}
	
	for (int index = 0; index < value2; index++) {
	    newArrays[value1 + index] = arrays2[index];

	}
	
	for (int index = 0; index < value; index++) {

	}
	
	System.out.print(Arrays.toString(newArrays));

    }

}