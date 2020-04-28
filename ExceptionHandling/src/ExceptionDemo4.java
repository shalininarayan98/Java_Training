class MyException extends Exception {
	
	public MyException() {
		super("My defined Exception");
	}
	
}

public class ExceptionDemo4 {

	static int sal = 5;
	static int minsal = 10;
	
	
	public static void main(String[] args) {
		try {
			if(sal<minsal) {
				throw new MyException();
		} 
			
		}catch(MyException e) {
			
		}

	}

}
