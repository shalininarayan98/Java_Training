package exercises;

//**INTERFACES
//it is used to define type

abstract class Account_temp{
	
	int i;
	abstract public void withdraw();
	public void show() {
		
	}
	
	//default is only accessible within the package- no need to declare it
	//public accessible everywhere i.e. outside package
	//so this statement is default (when you don't declare the accessibility)
	
	

}

//interfaces are also abstract
//cannot have anything non abstract ie a body


interface Account1 {
	
	//must initialise i 
	//by default it is public static final 
	int i=0; //public static final 
	
	//if you write it it is the same 
	public static final int a=0;
	public void withdraw();
	
	
	//can only have a body when there is a concrete static method
	
	public static void show() {
		
	}
	
	//but in interfaces everything is public by default (if not declared)
	//must specify it is default
	//cannot write concrete methods in interfaces
	//ONLY STATIC AND DEFAULT ALLOWED 
	//NO CONCRETE METHODS
	//
	default void show1() {
		
		
	}
	
	
	class SavingAccount1 extends Account_temp{
		//when working with abstracts 
		public void withdraw() {
		}
	
	class SavingAccount2 implements Account1{
		//when working with abstracts 
		public void withdraw() {
			
		}
	}
		
	abstract class SavingsAccount3 implements Account1{
		public void withdraw() {
			
		}
	}
	
	interface xxx extends Account1 {
		int j=0; 
	}
	
	
	
	class Y{
		public void show() {}
	}
	

	class Z{
		public void show() {}
	
	}
	
	//CAN ONLY EXTEND ONE CLASS AT A TIME- CAN'T EXTEND Y AND Z
	//MULTIPLE INHERITANCE NOT ALLOWED 
	
	class X extends Y {
		
	}
	
	//but if you want to implement 2 classes;
	
	class A{
		public void show() {}
	}
	

	interface B{
		public void show();
	
	}
	
	//CAN ONLY EXTEND ONE CLASS AT A TIME- CAN'T EXTEND Y AND Z
	//MULTIPLE INHERITANCE NOT ALLOWED 
	
	class C extends A implements B {
		
		public void show() {
			
		}
	}
		
	}
	
	//interface doesn't have a body 
	//interface solves the 

}

public class Test1 {
	
	//can't do this
	//Account1 a = new Account();
	
	//Account_temp at = new Account_temp();
	
	C c=new C();
	c.show();

}
