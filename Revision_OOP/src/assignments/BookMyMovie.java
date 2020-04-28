package assignments;

public class BookMyMovie {
	
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	public BookMyMovie(int movieId, int noOfTickets) {
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void calculateDiscount() {
		int value;
		
		if ((this.movieId==101)||(this.movieId==102)||(this.movieId==103) && (this.noOfTickets<5));
			this.discount = 0;
		if ((this.movieId==101)||(this.movieId==103) && (this.noOfTickets>=5 && this.noOfTickets<10));
			this.discount=15;
		if ((this.movieId==101)||(this.movieId==103) && (this.noOfTickets>=10 && this.noOfTickets<15));
			this.discount=20;
		if ((this.movieId==102) && (this.noOfTickets>=5 && this.noOfTickets<10));
			this.discount=10;
		if ((this.movieId==102) && (this.noOfTickets>=10 && this.noOfTickets<15));
			this.discount=15;
			
		
	}
	
	public double calculateTicketAmount() {
		int baseFare = 0;
		
		switch(this.movieId) {
		case (101):
			baseFare=120;
			break;
		case (102):
			baseFare=170;
			break;
		case(103):
			baseFare=150;
			break;
		default:
			System.out.println("invalid movie ID");
		
		}
		
		 this.totalAmount = (baseFare * this.getNoOfTickets()) - (baseFare * this.noOfTickets * (this.discount/100));
		 
		 return totalAmount;
	}
	

}
