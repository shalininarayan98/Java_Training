package method_overloading;

public class Test {
	
	public void show(String name) {
		System.out.println("Name " + name);
	
	}
	
	public void show() {
		System.out.println("Just like that... ");
	
	}
	
	public void show(int age) {
		System.out.println("Age " + age);
	
	}
	
	
	public void show(String name, int age) {
		System.out.println("Age " + age);
	
	}
	
	public void show(int age, String name) {
		System.out.println("Age " + age);
	
	}
	//same name of the method but different because of the parameters so they are actually different 
	//can have many different combinations
	public static void main(String[] args) {
		
		Test t = new Test();
		t.show("Alex");
		t.show(18);

	}

}
