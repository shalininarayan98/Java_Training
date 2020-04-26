package arraysAndMethods;

public class AssignmentFive {

	public static int[] findLeapYearList(int[] yearArray) {

		int retArr[] = new int[yearArray.length];
		int j = 0;
		for (int i = 0; i < yearArray.length; i++) {
			if (isLeapYear(yearArray[i]) == 1) {
				// System.out.println();
				retArr[j++] = yearArray[i];

			}

		}

		return retArr;

	}

	public static int isLeapYear(int year) {

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))

			return 1;

		else
			return 0;

	}

	public static void main(String[] args) {

		System.out.println(isLeapYear(2020));

		int[] yearArray = { 2011, 2012, 2013, 2014, 2015, 2020 };

		int[] finalArr = findLeapYearList(yearArray);

		for (int i = 0; i < finalArr.length; i++) {
			if (finalArr[i] == 0)
				continue;
			System.out.println(finalArr[i]);
		}

	}

}
