package assignmentOOP1;

public class Address {
	
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int pin;
	
	public Address(String firstLine, String secondLine, String city, String state, int pin) {
	
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPin() {
		return pin;
	}
	
}
