package arraysAndMethods;

public class AssignmentSix {
	
	public static int findFactorial(int number) {
		
		int noLast;
		int noFirst;
		int factLast=0;
		int factFirst=0;
		int factTotal = 0;
		
		while (number <0) {
			noLast = number % 10;
			
			for (int i =0; i<noLast; i++) {
				factLast = factLast *i;
			}
			
			noFirst = noLast/10;
			
			
			for (int i =0; i<noFirst; i++) {
				factFirst = factFirst *i;
			}
			
			factTotal = factFirst + factLast;
			
			return factTotal;
						 
		}
		
		
		
		if (factTotal == number) {
			System.out.println("strong number" + number);
			
		}
		
		else 
		return factTotal;
	

	}

	
	public static int[] findStrongNumbers(int[] numArrays) {
		
		
		
		return numArrays;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findFactorial(145));
	}

}
