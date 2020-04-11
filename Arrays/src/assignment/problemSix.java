package assignment;

public class problemSix {

	public static void main(String[] args) {
		int temp, reminder, j, i, fact;
		int[] array = { 1, 2, 9, 145, 452 };
		for (j = 0; j < array.length; j++) {
			int sum = 0;
			fact = 1;
			i = 1;
			temp = array[j];
			reminder = temp % 10;
			while (i <= reminder) {
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			temp = temp / 10;
			if (array[j] == sum) {
				System.out.println("\n " + array[j] + " is a Strong Number");
			}
		}
	}
}

