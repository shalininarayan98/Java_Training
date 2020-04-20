package oopConceptsThree;

public class Tester {
	
	public static void main(String[] args) {
		InfyDanceRegistration d = new InfyDanceRegistration("A", 1234567, "London");
		System.out.println("Hi "+ d.getName() + " your registration ID is: " + d.generateRegistrationId());
		
		InfyDanceRegistration d1 = new InfyDanceRegistration("A", 1234567, "London");
		System.out.println("Hi "+ d.getName() + " your registration ID is: " + d1.generateRegistrationId());
		
		
		System.out.println("Hi "+ d1.getName() + " your registration ID is: " + d1.generateRegistrationId());
	}

}
