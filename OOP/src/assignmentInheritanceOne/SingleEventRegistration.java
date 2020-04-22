package assignmentInheritanceOne;

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
		
		
		double fee = this.getRegistrationFee();
		
		//fee = 0;
		
		if (this.getNameOfEvent().equalsIgnoreCase("ShakeALeg")) {
			this.setRegistrationFee(100);
			
		}
		
		else if (this.getNameOfEvent().equalsIgnoreCase("Sing&Win")) {
			this.setRegistrationFee(150);
			
		}
		
		
		else if (this.getNameOfEvent().equalsIgnoreCase("PlayAway")) {
			this.setRegistrationFee(130);
			
		}
		
		//System.out.println("Fare is" + this.getRegistrationFee());
		System.out.println("participant number is: " + this.participantNo);
	}
		
	}
