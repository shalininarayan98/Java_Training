package assignmentInheritanceOne;

public class bankTester {

	public static void main(String[] args) {
		
		Account a = new Account();
		Customer c = new Customer();
		SavingsAccount sa = new SavingsAccount(101, c, 500, 12);
		CurrentAccount ca = new CurrentAccount(c, 500, 102,2000);
		
		//SavingsAccount accountSA = new SavingsAccount(101, c, 500, 12);
		
		c.setName("Shaz");
		c.setCustomerId(1);

	
		System.out.println("Name: " + c.getName());
		System.out.println("customer"+c.getCustomerId());
		sa.setBalance(800);
		System.out.println("Current balance in savings " + sa.getBalance());
		sa.withdraw(1);
		sa.getBalance();
		System.out.println("Interest Rate: " + sa.calculateInterest());

		ca.withdraw(100);
		
		//sysout(accountSA.getCustomer().getName());
		//sysout(accountSA.getBalance());
		//sysout(accountSA.getInterestRate());
		
		
		//accountSA.withdraw(1600)
		

	}

}
