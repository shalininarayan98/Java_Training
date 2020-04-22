package assignmentInheritanceOne;

public class PerformanceCalculator {
	
	public static void main(String[] args) {
		
		Employee_lastq e = new Employee_lastq();
		PerformanceRating pr = new PerformanceRating();
		
		e.setPoint(68);
		
		System.out.println("Rating: " + pr.calculatePerformance(e));
		
	}

}
