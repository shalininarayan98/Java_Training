package assignmentInheritanceOne;

public class ticketTester {

	public static void main(String[] args) {

		Ticket t = new Ticket(1, 10);

		if (t.validateTravelPoints() == true) {

			System.out.println("ticket amount is: " + t.calcTicketAmt());

		}

	}

}
