package assignmentInheritanceOne;

public class TeamEventRegistration extends SingleEventRegistration {

	private int noOfParticipants;
	private int teamNo;
	
	public TeamEventRegistration(String name, String nameOfEvent, int participantNo, int teamNo) {
		super(name, nameOfEvent, participantNo);
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
		
		//double fee = this.getRegistrationFee();
		
		//fee = 0;
		
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(50);
			
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(60);
			
		}

		
		else if (this.getNameOfEvent().equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(100);
			
		}
		
		//super.registerEvent();
		
		
		System.out.println("Fare is" + this.getRegistrationFee()); 
			
		
		
	}


}
