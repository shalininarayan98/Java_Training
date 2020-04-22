package assignmentInheritanceOne;

public class Account {

	protected int accountNo;
	protected Customer customer;
	protected double balance;
	
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		double newAmount;
		newAmount = amount+ this.balance;
		//this.balance = amount+ this.balance;
		this.setBalance(newAmount);
	}

}
