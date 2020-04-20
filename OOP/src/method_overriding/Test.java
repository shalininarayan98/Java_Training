package method_overriding;

class AAA {
	public void show() {
		System.out.println("AAA");
	}
}
class BBB extends AAA {
	public void show() {	
		System.out.println("BBB");
	}
	
	public void show1() {
		System.out.println("XXX");
	}
}

public class Test {
	public static void main(String[] args) {
		
		BBB b = new BBB();
		
		//AAA a = new AAA();
		// AAA a = new BBB(); NOT ALLOWED
		
		//this is allowed as its only one direction;
		
		AAA a = new BBB();
		
		a.show();
		
		//doesn't work because A doesn't know that a new method has been added
		a.show1();
	}
}


