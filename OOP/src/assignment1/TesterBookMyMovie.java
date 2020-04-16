package assignment1;

public class TesterBookMyMovie {

	public static void main(String[] args) {
		
		BookMyMovie m1 = new BookMyMovie(10, 4);
		
		System.out.println("movie ID: " + m1.getMovieId());
		System.out.println("number of tickets: " + m1.getNoOfTickets());
		System.out.println("total amount: " + m1.calculateTicketAmount());
		

	}

}
