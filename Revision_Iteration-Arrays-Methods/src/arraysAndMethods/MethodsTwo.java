package arraysAndMethods;

public class MethodsTwo {
	
	public static boolean isLeapYear(int year) {
		
		if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) {
			return true;
		}
		else
			return false;
	}
	
	

	public static void main(String[] args) {

		boolean flag = MethodsTwo.isLeapYear(2020);

		if (flag) {
			System.out.println("it is a leap year");
		}

		else
			System.out.println("it is not a leap year");

	}

}
