package assignmentInheritance;

public class CurrentAccount extends Account {
	
	private int overdraftAmount;
	
	public CurrentAccount(Customer customer, int overdraftAmount, int accountNo, double balance) {
		this.customer=customer;
		this.overdraftAmount=overdraftAmount;
		this.accountNo=accountNo;
		this.balance=balance;
	}

	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
	public double withdraw(double amount) {
		
		double newAmount = 0;
		double balance = this.getBalance();

				
		if (amount<balance){
		newAmount = balance-amount;
		this.setBalance(newAmount);
		}
		
		if (newAmount<=this.balance+this.getOverdraftAmount()) {
			System.out.println("New balance is: " + newAmount);
		}
		else 
			System.out.println("you don't have sufficient funds in savings account");

		return newAmount;	
	}
		
	}
	
	

