package assignmentOOP1;

public class InfyDanceRegistration {
	
	private static int counter;
	private String name;
	private long contactNumber;
	private String city;
	
	public InfyDanceRegistration(String name, long contactNumber, String city) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	
	public String generateRegistrationID() {
		
		String regId;
		
		regId = Integer.toString(10000+this.counter++);
		
		
		return ("D" + regId);
	}


	
	

}
