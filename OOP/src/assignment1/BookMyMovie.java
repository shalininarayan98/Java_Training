package assignment1;

public class BookMyMovie {
	
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	
	
	public BookMyMovie(int movieId, int noOfTickets) {
		this.movieId=movieId;
		this.noOfTickets=noOfTickets;
		
	}
	
	
	public int getMovieId() {
		
		return this.movieId;
	}
	
	public void setMovieId(int movieId) {
		
		this.movieId=movieId;
		
	}
	
	public int getNoOfTickets() {
		
		return this.noOfTickets;
	}
	
	public void setNoOfTickets(int noOfTickets) {
		
		this.noOfTickets=noOfTickets;
		
	}
	
	public double getDiscount() {
		
		return this.discount;
	}
	
	
	public double getTotalAmount() {
		
		return this.totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		
		this.totalAmount=totalAmount;
		
	}
	
	public void calculateDiscount() {
		
		//int discount = 0;
		
		if (movieId>=101 && movieId<=103 && noOfTickets==0) {
			this.discount = 0;
		}
		
		else if (movieId==101 || movieId==103 && noOfTickets>=5 && noOfTickets<=10) {
			
			this.discount = 15;
		}
		
		else if (movieId==101 || movieId==103 && noOfTickets>=10 && noOfTickets<=15) {
			
			this.discount= 20;
		}

		else if (movieId==102 && noOfTickets>=5 && noOfTickets<=10) {
			
			this.discount = 10;
		}
		
		else if (movieId==102 && noOfTickets>=10 && noOfTickets<=15) {
			
			this.discount = 15;
		}
				
	}
	
	public double calculateTicketAmount() {
		
		int baseFare = 0;
		
		switch (this.movieId) {
		
		case(101):
			baseFare=120;
			break;
			
		case(102):
			baseFare=170;
			break;
		
		case(103):
			baseFare=150;
			break;
			
		
		}
		
		
		this.calculateDiscount();
		this.totalAmount= baseFare * noOfTickets - (baseFare *noOfTickets*(discount/100));
		//System.out.println(totalAmount);
		return totalAmount;
		
	
	}
	
	

}

