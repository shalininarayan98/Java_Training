package assignmentInheritanceOne;

public class Ticket {
	
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	
	
	public Ticket() {
		this.startPoint=3;
		this.endPoint=9;
		
	}
	
	public Ticket(int startPoint, int endPoint) {
		super();
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
		
		if ((this.ticketAmount != 0) || (this.endPoint<this.startPoint)) {
			System.out.println("Invalid journey");
			return false;
		}

		return true;

		
	}
	
	public int calcTicketAmt() {
		
		this.ticketAmount = (this.endPoint-this.startPoint)*10;
		
		return ticketAmount;
	}

}
