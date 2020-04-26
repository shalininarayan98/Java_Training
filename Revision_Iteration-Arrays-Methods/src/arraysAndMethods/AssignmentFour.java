package arraysAndMethods;

public class AssignmentFour {

	public static void main(String[] args) {
		
		int count = 0;
		int occurences = 0;
		
		int[] numArray = {1,1,5,100,-20,-20,6,0,0,3,3};
		
		for (int i=0; i<=numArray.length-2; i++) {
			if (numArray[i] == numArray[i+1]) {
				occurences = count++;
			}
				
		}
		System.out.println(occurences);
		
	
		
	}
}
