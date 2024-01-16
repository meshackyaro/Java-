public class PetrolPurchaseTest{
	public static void main(String[] args){

	PetrolPurchaseTest petrolPurchase = new PetrolPurchaseTest("312 Herbert MaCauly Road Yaba", "Clean Petrol", 45, 40.00, 0.40);
	
	System.out.printf("Semicolon Energy located at %s, sells %s worth %d liters at %d per liter with an enjoyable discount of %d for all customers who purchase 30 liters and above", petrolPurchase.getLocation(), petrolPurchse.getTypeOfPetrol(), petrolPurchase.getQuantity(), petrolPurchase.getPricePerLiter(),petrolPurchase.getDiscount());
	

	}

}