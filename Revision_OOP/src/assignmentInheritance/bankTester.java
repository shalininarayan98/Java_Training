package assignmentInheritance;

public class bankTester {

	public static void main(String[] args) {
		
		Account a = new Account();
		SavingsAccount sa = new SavingsAccount(1000, 500.00, 12);
		Customer c =  new Customer();
		CurrentAccount ca = new CurrentAccount(c, 500, 10001, 2100);
		
		a.deposit(1400);
		sa.setBalance(1000);
		System.out.println(sa.getBalance());
		sa.withdraw(100);
		System.out.println(sa.getBalance());
		System.out.println(sa.getInterestRate());
		System.out.println(sa.calculateInterest());
		
		ca.withdraw(100);
		System.out.println(ca.getBalance());
	
		
		
		//System.out.println(sa.calculateInterest());
		//sa.withdraw(100);
		//sa.getBalance();

	}

}
