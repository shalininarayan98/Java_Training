package oopConceptsThree;

public class InfyDanceRegistration {
	
	private static int counter = 1;
	private String name;
	private long contactNumber;
	private String city;
	
	public InfyDanceRegistration(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String generateRegistrationId() {
		
		int counterInt = 10000+this.counter;
		String counterString = "D" + Integer.toString(counterInt);

		//System.out.println("D" + counterString);
		return counterString;

		
	}
	
	
	

}
