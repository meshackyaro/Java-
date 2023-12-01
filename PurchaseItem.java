import java.util.Scanner;
public class PurchaseItem{
	public static void main(String[] args){
	Scanner inputItem = new Scanner(System.in);

	System.out.print("Enter an item: ");
	String item = inputItem.nextLine();

	System.out.print("Enter price: ");
	double priceOfItem = inputItem.nextDouble();

	double discount = (10 / 100.0);
	double totalAmount = priceOfItem *(1 - discount);

	if (priceOfItem < 0){
		System.out.print("Invalid price! Please enter a valid amount");
	}else{
		System.out.printf("Item:  %s%nPrice:  %f%nDiscount: 10%s%n Total: %.2f%n: ", item, priceOfItem,"%",  totalAmount);
		
	}
	


	}



}