package exercises;

public class New_Arrays_Practice {
	public static void main (String[] args) {
	
	/*int[] marksOfStudents = new int[3];
	
	marksOfStudents[0] = 85;
	marksOfStudents[1] = 65;
	marksOfStudents[2] = 90;
	
	System.out.println(marksOfStudents[1]);

	}*/
		
	/*int[] marksOfStudents = { 85, 65, 90 };
	for (int index=0; index<marksOfStudents.length;index++) {
		
		System.out.println(marksOfStudents[index]);
	}*/
		
	String flightNumbers[] = new String[10];
	String flightNumber;
	
	for (int i = 0; i<10; i++) {
		
		flightNumber = "FT" + (i +1);
		flightNumbers[i] = flightNumber;
	}
	
	for (String flight : flightNumbers) {
		
		System.out.println(flight);
	}
		
}
}
