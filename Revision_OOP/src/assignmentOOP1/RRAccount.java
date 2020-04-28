package assignmentOOP1;

public class RRAccount {
	
	private String CustomerName;
	private Address address;
	private double depositAmount;
	
	public RRAccount(String customerName, Address address, double depositAmount) {
		
		CustomerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public Address getAddress() {
		return address;
	}

	public double getDepositAmount() {
		return depositAmount;
	}
	
	public boolean isValidAddress() {
		
		boolean flag=false;
		
		if (Integer.toString(address.getPin()).length()==6) {
			flag=true;	
		}
		
		if(flag)
			return true;
		else
			return false;
			
	
	}
	
	
}
