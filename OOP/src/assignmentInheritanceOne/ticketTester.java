package assignmentInheritanceOne;

public class ticketTester {

	public static void main(String[] args) {

		Ticket t = new Ticket(10, 1);

		if (t.validateTravelPoints() == true) {

			System.out.println("ticket amount is: " + t.calcTicketAmt());

		}

	}

}
