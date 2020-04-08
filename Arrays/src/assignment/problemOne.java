package assignment;

public class problemOne {

	public static void main(String[] args) {

		int arr[] = { 1,2,2,2,4, };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		// TOTAL
		System.out.println("the total number of runs is " + sum);

		// AVERAGE
		int average = (sum / arr.length);

		System.out.println("the average number of runs is " + average);

		System.out.println("The numbers in the array that are greater than the average are: ");

		// ABOVE AVERAGE
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > average) {

				System.out.println(arr[i]);
			}

		}
		System.out.println("The numbers in the array that are smaller than the average are: ");

		// BELOW AVERAGE
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < average) {

				System.out.println(arr[i]);
			}

		}

	}

}

