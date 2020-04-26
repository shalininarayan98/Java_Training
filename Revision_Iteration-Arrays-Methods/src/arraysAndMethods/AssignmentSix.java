package arraysAndMethods;

public class AssignmentSix {
	
	public static int findFactorial(int number) {

		int last = 0;
		int first = 0;
		int newNum = 0;
		int middle = 0;
		int factLast = 1;
		int factMiddle = 1;
		int factFirst=1;

		for (int i = 1; i < number; i++) {
			
			last = number % 10;
			
			newNum = number / 10;
			
			middle = newNum % 10;
			
			first = newNum /10;
		}	
			
		

		if (first != 0) {
			for (int i=1; i<= first; i++) {
					
				factFirst = factFirst * i;
			}
		}
				
		else
			factFirst = 1;
		
			
		if (middle != 0) {
			for (int i=1; i<= middle; i++) {
					
				factMiddle = factMiddle * i;
			}
		}
				
		else
			factMiddle = 1;
				
		
			
		if (last !=0) {
			for (int i=1; i<= last; i++) {
					
				factLast = factLast * i;
			}
		}
				
		else
			factLast = 1;			
	
		
		if (factFirst + factMiddle + factLast == number)
			return 1;
			//System.out.println("strong number");
		else
			return 0;

				
		/*System.out.println("first number: " + first);
		System.out.println("middle number: " + middle);
		System.out.println("last number: " + last);
		System.out.println("factorial of first number: " + factFirst);
		System.out.println("factorial of middle number:" + factMiddle);
		System.out.println("factorial of last number: " +factLast);
		
		*/
		//return number;
	
}	
	public static int[] findStrongNumbers(int[] numArrays) {
		
		int strongNumsArr[] = new int[numArrays.length];
		
		int j = 0;
		
		for (int i=0; i<numArrays.length; i++) {
			if (findFactorial(numArrays[i]) == 1) {
				strongNumsArr[j] = numArrays[i];
				j++;
			}
		}

		return numArrays;
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(findFactorial(145));
		
		int[] numArrays = {100, 101, 145, 190};
		int finalArr[] = findStrongNumbers(numArrays);
		for (int i=0; i< finalArr.length; i++) {
			if(finalArr[i] ==0)
				continue;
			System.out.println(finalArr[i]);
		}
	}

}

