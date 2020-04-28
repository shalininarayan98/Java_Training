package assignmentInheritance;

public class EventRegistration {
	
	private String name;
	private String nameOfEvent;
	protected double registrationFee;
	
	
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
		
		
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(100);
		}
		else if (this.getNameOfEvent().equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(150);
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("Actathon")) {
			this.setRegistrationFee(70);
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(130);
		}
		
		System.out.println("Event registration fee is: " + this.getRegistrationFee());
		
		}
	}
	
