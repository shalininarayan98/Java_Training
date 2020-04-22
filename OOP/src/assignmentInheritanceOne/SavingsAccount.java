package assignmentInheritanceOne;

public class SavingsAccount extends Account {
	
	private double minimumBalance;
	private int interestRate;
	
	public SavingsAccount(int accountNo, Customer customer, double minimumBalance, int interestRate) {
		this.accountNo = accountNo;
		this.minimumBalance = minimumBalance;
		this.interestRate=interestRate;
		this.customer=customer;
		//setAccountNo(accountNo)
		//setCustomer(customer)
		//setBalance(balance)
		//for if it is private, not protected like done here
	}
	
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public double withdraw(double amount) {
		
		double newAmount = 0;
		double balance = this.getBalance();

				
		if (amount<balance){
		newAmount = balance-amount;
		this.setBalance(newAmount);
		}
		
		if (newAmount>=this.minimumBalance) {
			System.out.println("New balance is: " + newAmount);
		}
		else 
			System.out.println("you don't have sufficient funds in savings account");

		
		return newAmount;	
		
		/*public void withdraw(double amount)
		 * if ((this.getBalance()-amount)>this.minimumBalance) {
		 * 	this.setBalance(getBalance() - amount;
		 * }
		 * 
		 * else {
		 *   sysout("You do not have sufficient balance")
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	public double calculateInterest() {
		
		return this.interestRate = (int) (this.getBalance()*this.interestRate/100);
		
	}

}
