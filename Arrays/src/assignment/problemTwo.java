package assignment;

public class problemTwo {
	
	public static void main(String[] args) {
		
		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0}; 
		
		double sum = 0; 
		double average = 0;
		double count = 0;
		int countEqual=0;
		int countLesser = 0;
		int countGreater = 0;
		
		for (int i=0; i<salary.length; i++) {
			
			sum = sum + salary[i];
			average = sum/(salary.length);
			
		}
		System.out.println("sum is: " + sum);
		System.out.println("average salary is: " + average);
		
		
		for (int i=0; i < salary.length; i++) {
			
			if (salary[i]==average) {
				
				countEqual++;
			}
					
		}
		System.out.println("number of people having a salary equal to the averag is: " + countEqual);
		
		for (int i=0; i < salary.length; i++) {
			
			if (salary[i]<average) {
				
				countLesser++;
			}
					
		}
		System.out.println("number of people having a salary lesser than the average is: " + countLesser);
		
		for (int i=0; i < salary.length; i++) {
			
			if (salary[i]>average) {
				
				countGreater++;
			}
					
		}
		System.out.println("number of people having a salary greater than the average is: " + countGreater);
				
	}
						
}
	
	


