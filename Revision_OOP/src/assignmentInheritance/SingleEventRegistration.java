package assignmentInheritance;

public class SingleEventRegistration extends EventRegistration {
	
	private int participantNo;
	
	public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
		this.participantNo=participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	public void registerEvent() {
		
		
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(100);
		}
		else if (this.getNameOfEvent().equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(150);
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(130);
		}
		
		
		System.out.println("single registration fee is: " + this.getRegistrationFee());
		
		}

	
	

}
