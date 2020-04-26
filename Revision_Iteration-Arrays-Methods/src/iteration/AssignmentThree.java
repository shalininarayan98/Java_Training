package iteration;

public class AssignmentThree {

	public static void main(String[] args) {
		
		int number = 2716;
		int reversed = 0;
		//int digit;
		
		while(number != 0) {
			
			//get last number and store as 'digit'
			int digit = number % 10;
			
			//store this digit under the variable 'digit'
			reversed = reversed *10 + digit;
			
			//divide by 10 to chop off the last number (digit) and store this as 'number'
			number /= 10;
			
		}
		
		System.out.println(reversed);
		

	}

}
