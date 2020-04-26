package arraysAndMethods;

public class AssignmentTwo {
	
	private static int lesser;
	private static int greater;
	private static int equal;
	
	
	public static double averageSalary(double salary[]) {
		
		double total = 0;
		double average = 0;
		int count=0;

		
		for (int i = 0; i< salary.length; i++) {
			
			total = total + salary[i];
			average = total/salary.length;
					
		}
		
		for (int i = 0; i< salary.length; i++) {
			
			if (salary[i]>average) {
				greater = count++;
			}
			
			else if (salary[i]==average) {
				equal=count++;
			}
			
			if (salary[i]<average) {
				lesser=count++;
			}
		}
		
		return average;
		
	}
	

	public static void main(String[] args) {
		
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		
		averageSalary(salary);
		
		System.out.println(averageSalary(salary));
		
		AssignmentTwo t = new AssignmentTwo();
		
		System.out.println("greater is: " + t.greater);
		System.out.println("less than is " + t.lesser);
		System.out.println("equal is " + t.equal);

	}

}
