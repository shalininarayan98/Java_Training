package assignmentInheritance;

public class PerformanceRating extends Employee_lastq {
	
	private static final int OUTSTANDING = 5;
	private static final int GOOD = 4;
	private static final int AVERAGE = 3;
	private static final int POOR = 2;
	
	
	static int calculatePerformance(Employee_lastq employee) {
		
		int point = employee.getPoint();
		
		if (point >= 80) {
			return OUTSTANDING;
		}
		if (point >= 60) {
			return GOOD;
		}
		if (point >=50) {
			return AVERAGE;
		}
		
		return POOR;
		
		
	}

}
