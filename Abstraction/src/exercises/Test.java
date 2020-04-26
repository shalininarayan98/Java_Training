package exercises;

//**ABSTRACTION**

abstract class Account{
	
	//purpose of this class is to tell the basic features one can have in account
	//don't want an object because you want just an account, you want a savings account/ current account etc...
	//not to create an object
	//abstract means you can't make an object 
	//means there is consistency and guidelines in the derived class
	// no body here for the logic because most of the time you are not sure what it should do in the context
	
	
	abstract public void withdraw(); 
	
	//possible to have no abstract members here as well aka CONCRETE METHOD
	
	public void show() {
		
	}
	
}


class SavingAccount extends Account {
	
	//want to create an object here
	//WHEN YOU USE AN ABSTRACT CLASS YOU ARE FORCED TO OVERRIDE THE ABSTRACT METHOD
	//SAME METHOD IS ALSO REQUIRED 
	
	public void withdraw() {
		
		
	}
	/*public void withdrawMoney() {
		
		NOT NEEDED NOW DUE TO ABSTRACT CLASS 
	}*/
	
}



//if you want to extend the abstract class but don't want to override the method, you can do this;
//must also be abstract class
abstract class SavingAccount1 extends Account {

	
}



class CurrentAccount extends Account {
	
	// and want to create an object here 
	
	//different names for both these methods so difficult for dynamic binding 
	public void withdraw() {
		
		
	}
	
	/*public void withdrawMyMoney() {
		
		NOT NEEDED NOW DUE TO ABSTRACT CLASS 
		
	}*/
}

public class Test {
	
	public void calculateTax(SavingAccount sa) {
		
		
	}
	
	public void calculateTax(CurrentAccount ca) {
		
		
	}
	
	//OR THIS IS BETTER 
	
	public void calculateTax(Account a) {
		
		a.withdraw();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		//Account a = new Account(); (doesn't work as its abstract)
		
		CurrentAccount ca = new CurrentAccount();
		
		SavingAccount sa = new SavingAccount();
		
		sa.withdraw();
		ca.withdraw();
		ca.show();
		
	
		t.calculateTax(ca);
		t.calculateTax(sa);
	}
	
	//at run time this means you can do dynamic binding 

}
