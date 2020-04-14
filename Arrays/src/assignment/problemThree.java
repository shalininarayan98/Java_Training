package assignment;

public class problemThree {
	
	public static void main(String[] args) {
		
		int[] numArray = {4,6,8,7};
		
		int[] evenNumArray = findEvenArray(numArray);
		for (int evenNum: evenNumArray) {
			System.out.println(evenNum);
		}
		 
		
	}
	
	
	public static int[] findEvenArray(int[] numArray) {
		
		int[] newNumArray;
		int countOfEven = 0;
		
		//FIND COUNT
		for (int num: numArray) {
			
			if(num%2==0) 
				countOfEven++;
		}
		
		//DECLARE IT AND STORE IN  NEW VARIABLE UNTIL YOU KNOW HOW MANY ARE EVEN 
		newNumArray = new int[countOfEven];
		
		for(int i = 0, j = 0; i<numArray.length; i++) {
			
			if(numArray[i]%2==0) {
				
				//NEW NUMBER TRANSFERED INTO NEW ARRAY
				newNumArray[i] = numArray[i];
				j++;
			}
		}
		
		
		
		//RETURN EVEN NUMBERS
		return newNumArray;
		
	
	
	}
}