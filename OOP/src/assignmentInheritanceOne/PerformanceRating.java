package assignmentInheritanceOne;

public class PerformanceRating extends Employee_lastq {
	
	private final static int OUTSTANDING = 5;
	private final static int GOOD = 4;
	private final static int AVERAGE = 3;
	private final static int POOR = 2;
	
	
	static int calculatePerformance (Employee_lastq employee) {
		
	
	
		if(employee.getPoint()>=100 && employee.getPoint()<=100) { 
			return OUTSTANDING;
		}
		
		if(employee.getPoint()>=60 && employee.getPoint()<=79) {
			return GOOD;
		}
		
		if(employee.getPoint()>=50 && employee.getPoint()<=59) {
			return AVERAGE; 
		}
		

		return POOR;
		
		
		
		

	}
	
	

}
