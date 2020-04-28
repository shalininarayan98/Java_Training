package assignmentInheritance;

public class SavingsAccount extends Account {
	
	private double minimumBalance;
	private int interestRate;
	
	public SavingsAccount(int accountNo, double minimumBalance, int interestRate) {
		this.accountNo = accountNo;
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
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
	}
	
	public double calculateInterest() {
		
		return this.interestRate = (int) ((this.getInterestRate()*this.getBalance())/100);

	}
	
	
	

}
