public class PetrolPurchase{
	private String location;
	private String typeOfPetrol;
	private int quantity;
	private double pricePerLiter;
	private double discount;

	public PetrolPurchase(String location, String typeOfPetrol, int quantity, double pricePerLiter, double discount){

	this.location = location;
	this.typeOfPetrol = typeOfPetrol;
	this.quantity = quantity;
	this.pricePerLiter = pricePerLiter;
	this.discount = discount; }

	public void setLocation(String location){
		this.location = location; }

	public void setTypeOfPetrol(String typeOfPetrol){
		this.typeOfPetrol = typeOfPetrol; }
	
	public void setQuantity(int quantity){
		this.quantity = quantity; }

	public void setPricePerLiter(double pricePerLiter){
		this.pricePerLiter = pricePerLiter; }

	public void setDiscount(double discount){
		this.discount = discount; }
	
	public String getLocation(){
		return location; }

	public String getTypeOfPetrol(){
		return typeOfPetrol; }	

	public int getQuantity(){
		return quantity; }

	public double getPricePerLiter(){
		return pricePerLiter; }

	public double getDiscount(){
		double discount = 0.40 * getPricePerLiter();
		return discount; }

	public double getPurchaseAmount(){
		double purchaseAmount = getNetPurchase() - getDiscount(); 
		return purchaseAmount; }
	
	public double getNetPurchaseAmount(); {
		double netPurchase = getQuantity() * pricePerLiter();

}