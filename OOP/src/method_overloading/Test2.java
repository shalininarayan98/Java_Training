package method_overloading;

public class Test2 {
	//method overloading 
	public void show(String name, int age) {
		System.out.println("1.Name: " + name + " Age " + age);
	
	}
	
	public void show(int age, String name) {
		System.out.println("2. Name " +name + " Age " + age);
	
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.show("Alex", 25);
		t2.show(18, "Ed");

		
		
	}

}
