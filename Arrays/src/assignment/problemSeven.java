package assignment;

public class problemSeven {

	public static void getOccuringChar(String str) {

		int count[] = new int[256];

		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int letter = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					letter++;
			}

			if (letter == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {

		String str = "hello";

		getOccuringChar(str);
	}

}


