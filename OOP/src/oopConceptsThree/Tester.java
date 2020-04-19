package oopConceptsThree;

public class Tester {
	
	public static void main(String[] args) {
		InfyDanceRegistration d = new InfyDanceRegistration("Shaz", 1234567, "MK");
		System.out.println("Hi "+ d.getName() + " your registration ID is: " + d.generateRegistrationId());
	}

}
