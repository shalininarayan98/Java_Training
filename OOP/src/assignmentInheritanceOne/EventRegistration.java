package assignmentInheritanceOne;

public class EventRegistration {

	private String name;
	private String nameOfEvent;
	private double registrationFee;
	
	
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNameOfEvent() {
		return nameOfEvent;
	}


	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}


	public double getRegistrationFee() {
		return registrationFee;
	}


	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent() {
		
		//this.registrationFee = 0;
		
		if (this.nameOfEvent.equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(100);
			//System.out.println("Fare is" + baseFare);
		}
		
		else if (this.nameOfEvent.equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(150);
			//System.out.println("Fare is" + baseFare);
		}
		
		else if (this.nameOfEvent.equalsIgnoreCase("Actathon")) {
			this.setRegistrationFee(70);
			//System.out.println("Fare is" + baseFare);
		}
		
		else if (this.nameOfEvent.equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(130);
			
		}
		
		System.out.println("Fare is" + this.getRegistrationFee());
		
		
		
		
	}

}

