package assignmentInheritanceOne;

public class CurrentAccount extends Account {
	
	private int overdraftAmount;

	public CurrentAccount(Customer customer, int overdraftAmount, int accountNo, double balance) {
		this.customer = customer;
		this.overdraftAmount = overdraftAmount;
		this.accountNo = accountNo;
		this.balance = balance;
		
		//this.setAccountNo(accountNo)
		//this.overdraft=overdraftAmount
		//this.setBalance(balance+this.overdraftAmount())
		//this.setCustomer(customer)
		//for when properties are private 
		
	}
	
	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
	public double withdraw(double amount) {
		
		double newAmount = 0;
		double balance = this.balance+this.overdraftAmount;

				
		if (amount<balance){
		newAmount = balance-amount;
		this.setBalance(newAmount);
		}
		
		if (newAmount<=(balance+1000)) {
			System.out.println("New balance in current account is: " + newAmount);
		}
		else 
			System.out.println("you don't have sufficient funds in current Account");

		
		return newAmount;	
		
		
		/*public void withdraw(double amount)
		 * 
		 * if(getBalance()<0) {
		 * 		if (getBalance()>amount) {
		 * 			setBalance(getBalance()-amount);
		 * 		}
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	

}
