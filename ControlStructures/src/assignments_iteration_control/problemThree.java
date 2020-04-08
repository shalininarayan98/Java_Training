package assignments_iteration_control;

public class problemThree {
	
	public static void main (String[] args) {
		
		int number = 27;
		int reversed = 0;
		
		while(number != 0) {
			int digit = number % 10;
			reversed = reversed *10 + digit;
			number /= 10;
		}
		
		System.out.println("using a while loop, the reversed number is: " + reversed);
		
		
	}

}


