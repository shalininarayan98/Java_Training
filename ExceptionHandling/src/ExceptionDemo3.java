import java.io.IOException;

//exception propogation 

public class ExceptionDemo3 {
	
	public static void A() throws IOException {
		B();
		
	}
	
	public static void B() throws IOException {
		//try { 
		C();
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		//}
	}
	
	public static void C() throws IOException {
		//try {
		//throw new ArithmeticException();
		throw new IOException();
		//}
		//catch(Exception e) {
			
		//}
		

	}

	public static void main(String[] args) {
		try {
		A();
		} catch (Exception e) {
			
		}

	}

}
