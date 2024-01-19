public class SideBySideMultiplicationTable {
    public static void main(String[] args) {

	for (int counter = 1; counter <= 12; counter++) {
	  
	    for (int count = 1; count <= 12; count++) {
	
		System.out.print(count +" X "+ counter +" = "+ (count * counter) +"\t");
	    }
		
	    System.out.println();
	
	}
	
    }

}