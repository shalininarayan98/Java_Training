package assignment;

public class problemTwo {

	public static void main(String[] args) {

		double arr[] = { 1000.0, 110.0, 1200.0, 2200.0 };

		double sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		// AVERAGE
		double average = (sum / arr.length);

		System.out.println("the average salary is " + average);

		System.out.println("Salary greater than the average are: ");

		// ABOVE AVERAGE
		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			if (arr[i] > average) {

				System.out.println(arr[i]);

			}

		}
		System.out.println("Salary below the average are: ");

		// BELOW AVERAGE
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < average) {

				System.out.println(arr[i]);
			}

		}

	}

}

	
	


