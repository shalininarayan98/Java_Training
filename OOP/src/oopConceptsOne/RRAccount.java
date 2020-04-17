package oopConceptsOne;

public class RRAccount {

	private String customerName;
	private Address address;
	private double depositAmount;

	public RRAccount(String customerName, Address address, double depositAmount) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Address getAddress() {
		return address;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public boolean isValidAddress() {

		int n = address.getPinCode();
		int count = 0;
		int length;

		while (n > 0) {
			n = n % 10;
			count++;
			n = n / 10;
		}

		length = count;

		if (length == 6);
		System.out.println("The pin code you entered by you is false");
		
		
		return true;
	}

}
