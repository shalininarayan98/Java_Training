package assignmentInheritance;

public class TeamEventRegistration extends EventRegistration {
	
	private int noOfParticipants;
	private int teamNo;
	
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants=noOfParticipants;
		this.teamNo=teamNo;
		
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {

		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(50);
		}
		else if (this.getNameOfEvent().equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(160);
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("Actathon")) {
			this.setRegistrationFee(80);
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(100);
		}
		
		this.setRegistrationFee(registrationFee*this.getNoOfParticipants());
		
		System.out.println("team registration fee is: " + this.getRegistrationFee());
		
		}
	}
	
	

