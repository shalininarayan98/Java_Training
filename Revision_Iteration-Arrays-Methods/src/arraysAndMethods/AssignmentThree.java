package arraysAndMethods;

public class AssignmentThree {
	
	public static int[] findEvenArray(int[] numArray) {

		//get length of array
		int count= 0;
		for (int num : numArray) {
			if (num % 2 ==0) {
				count++;
			}
		}
		
		int[] evenNums;
		
		evenNums = new int [count]; 
		
		for(int i = 0, j = 0; i<numArray.length; i++) {
			
			if(numArray[i]%2==0) {
				evenNums[j] = numArray[i];
				j++;
			}
		
		
		}	
		

		return evenNums;
	}
	

	public static void main(String[] args) {
		
		int[] numArray = {2,3,4,5,6,7,9};
		
		int[] evenNumArray = findEvenArray(numArray);
		for (int evenNum: evenNumArray) {
			System.out.println(evenNum);
	}
	}

}
