package arraysAndMethods;

public class AssignmentSeven {
	
	public static int findOccurences(String word, char letter) {
		
		int count = 0;
		
		for (int i =0; i< word.length(); i++) {
			if (word.charAt(i)==letter) {
				count++;
			}
		}
		
		System.out.println(count);
		return count;
			
	}
	

	public static void main(String[] args) {
		
		findOccurences("hello", 'l');
		

	}

}
