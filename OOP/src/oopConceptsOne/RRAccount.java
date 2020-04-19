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
		
		while (n !=0) {
			
			n/=10;
			++count;
		}
		
		
		
		if (count !=6) {
			System.out.println("This is not a valid pin!");
			System.out.println("You have only enetered: " + count + " digits");
				
		}
		return true;	

		
	}

}
