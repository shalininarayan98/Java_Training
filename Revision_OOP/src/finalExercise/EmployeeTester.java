package finalExercise;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setScore(86);
		System.out.println(e.getScore());
		
		System.out.println(e.calculateFinalSalary(e.getScore()));

	}

}
