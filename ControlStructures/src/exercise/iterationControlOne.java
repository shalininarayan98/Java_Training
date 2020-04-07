package exercise;

public class iterationControlOne {
	
	public static void main (String[] agrs) {
		
		int input = 10;
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			
			sum = sum + i;
			System.out.println("sum after adding " + i+ " is: " + sum);
			
		}
		
		System.out.println();
		System.out.println("sum of numbers till " + input + " is " +sum);
			
		}
	}