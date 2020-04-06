package assignments_variables_etc;

public class problemSeven {
	
	public static void main (String[] args) {
		
		int number = 22;
		
		if (number % 3 == 0 && number % 5 !=0) {
			
			System.out.println("Zip");
		}
		
		else if (number % 5 == 0 && number % 3 !=0) {
			
			System.out.println("Zap");
		}
		
		else if (number % 5 ==0 && number % 3 ==0) {
			
			System.out.println("Zoom");
		}
		
		else
			System.out.println("Invalid");
		
	}

}
