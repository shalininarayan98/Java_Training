package method_overloading;

public class Test3 {
	//method overloading 
	public void show(int sal, int age) {
		System.out.println("1.sal: " + sal + " Age " + age);
	
	}
	
	public void show(int age, float sal) {
		System.out.println("2. sal " +sal + " Age " + age);
	
	}
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		//looks for the exact data type 
		//if not it looks for closest- can automatic type conversion be done
		//if not the method is not called eg if you convert from int to string 
		
		
		t3.show(20000, 25);
		t3.show(25, 20000.0f);
		

		
		
	}

}
