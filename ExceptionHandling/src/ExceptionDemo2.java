import java.io.IOException;



public class ExceptionDemo2 {
	public static void main(String[] args) {
	
		try {
			throw new IOException();
		}catch(Exception e) {
			
		}
		
		throw new ArithmeticException();
	}
	

}
