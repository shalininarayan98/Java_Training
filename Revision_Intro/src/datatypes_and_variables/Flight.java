package datatypes_and_variables;

public class Flight {

	private int flightsTakenOff;
	private int flightsLanded;
	private int seatsFlightsTakenOff;
	private int seatsFlightsLanded;
	private int noOfCookiesSold;
	
	public Flight(int flightsTakenOff, int flightsLanded, int seatsFlightsTakenOff, int seatsFlightsLanded) {
	
		this.flightsTakenOff = flightsTakenOff;
		this.flightsLanded = flightsLanded;
		this.seatsFlightsTakenOff = seatsFlightsTakenOff;
		this.seatsFlightsLanded = seatsFlightsLanded;
	}
	
	public int getFlightsTakenOff() {
		return flightsTakenOff;
	}


	public int getFlightsLanded() {
		return flightsLanded;
	}


	public int getSeatsFlightsTakenOff() {
		return seatsFlightsTakenOff;
	}


	public int getSeatsFlightsLanded() {
		return seatsFlightsLanded;
	}
	
	public int calcCookiesSold() {
		
		int totalTakeOff = this.getFlightsTakenOff() * (this.getSeatsFlightsTakenOff()*2);
		int totalLanded = this.getFlightsLanded() * this.getSeatsFlightsLanded();
		
		noOfCookiesSold = (totalTakeOff+totalLanded);
		
		return noOfCookiesSold;

	}
	

	public static void main(String[] args) {
		Flight f  = new Flight(100,110,150,186);
		System.out.println(f.calcCookiesSold());
		
		Flight f1  = new Flight(50, 85, 180, 150);
		System.out.println(f1.calcCookiesSold());
	}

}
