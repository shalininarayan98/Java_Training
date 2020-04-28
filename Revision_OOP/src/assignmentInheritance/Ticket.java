package assignmentInheritance;

public class Ticket {
	
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	
	Ticket() {
		
	}

	public Ticket(int startPoint, int endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public int getStartPoint() {
		return startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}
	
	public boolean validateTravelPoints() {
		
		if (this.startPoint>0&& this.endPoint>this.startPoint);
		return true;

	}
	
	public int calcTicketAmount() {
		if ((validateTravelPoints()) == true) {
			
			this.ticketAmount=(this.endPoint-this.startPoint)*10;
			
		}
		
		
		return this.ticketAmount;
	}
	

}
