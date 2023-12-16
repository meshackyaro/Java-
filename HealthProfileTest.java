public class HealthProfileTest{
	public static void main(String[] args){

	HealthProfile healthProfile = new HealthProfile("Marv", "Isaiah", "Female", "03/03", "March", "Wednesday", 2010, 17.0, 150);

	System.out.printf("Health profile for %s %s, a %s, born %s, in the month of %s, on %s, in the year %d, with a height of %.1f inches, weighing %.1f pounds. She has a Body Mass Index of %.1f, a maximum heart rate of %d and a target heart rate range of %.1f", healthProfile.getFirstName(), healthProfile.getLastName(), healthProfile.getGender(), healthProfile.getDateOfBirth(), healthProfile.getMonth(), healthProfile.getDay(), healthProfile.getYearOfBirth(), healthProfile.getHeightInInches(), healthProfile.getWeightInPounds(), healthProfile.getBMI(), healthProfile.getMaxHeartRate(), healthProfile.getTargetHeartRate());

	}

}