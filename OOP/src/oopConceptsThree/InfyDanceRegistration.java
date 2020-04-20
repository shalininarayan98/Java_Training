package oopConceptsThree;

public class InfyDanceRegistration {
	
	private static int counter;
	private String name;
	private long contactNumber;
	private String city;
	private int regId;
	
	public InfyDanceRegistration(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
		this.regId = counter++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String generateRegistrationId() {
		
		int counterInt = 10000+this.regId;
		String counterString = "D" + Integer.toString(counterInt);

		//System.out.println("D" + counterString);
		return counterString;

		
	}		

}
