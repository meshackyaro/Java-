public class HealthProfile{

	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String month;
	private String day;
	private int yearOfBirth;
	private double heightInInches;
	private double weightInPounds;

public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth, String month, String day, int yearOfBirth, double heightInInches, double weightInPounds){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.month = month;
		this.day = day;
		this.yearOfBirth = yearOfBirth;
		this.heightInInches = heightInInches;
		this.weightInPounds = weightInPounds; }

	public void setFirstName(String firstName){
		this.firstName = firstName; }
	
	public void setLastName(String lastName){
		this.lastName = lastName; }

	public void setGender(String gender){
		this.gender = gender; }

	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth; }

	public void setMonth(String month){
		this.month = month; }
	
	public void setDay(String day){
		this.day = day; }

	public void setYearOfBirth(int yearOfBirth){
		this.yearOfBirth = yearOfBirth; }

	public void setHeightInInches(double heightInInches){
		this.heightInInches = heightInInches; }

	public void setWeightInPounds(double weightInPounds){
		this.weightInPounds = weightInPounds; }

	public String getFirstName(){
		return firstName; }

	public String getLastName(){
		return lastName; }

	public String getGender(){
		return gender; }

	public String getDateOfBirth(){
		return dateOfBirth; }

	public String getMonth(){
		return month; }

	public String getDay(){
		return day; }

	public int getYearOfBirth(){
		return yearOfBirth; }
	
	public double getHeightInInches(){
		return heightInInches; }

	public double getWeightInPounds(){
		return weightInPounds; }

	public int getAgeInYears(){
		int ageInYears = 2023 - getYearOfBirth();
		return ageInYears; }

	public int getMaxHeartRate(){
		int maxHR = 220 - getAgeInYears();
		return maxHR; }

	public double getTargetHeartRate(){
		double targetHeartRate = (double) 0.85 * getMaxHeartRate();
		return targetHeartRate; }

	public double getBMI(){
		double BMI = (getWeightInPounds() * 703) / (getHeightInInches() * getHeightInInches());
		return BMI; }



}