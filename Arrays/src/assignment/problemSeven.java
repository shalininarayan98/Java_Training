package assignment;

public class problemSeven {

	public static int findOccuring(String word) {

		int count[] = new int[256];

		int len = word.length();

		for (int i = 0; i < len; i++)
			count[word.charAt(i)]++;

		char ch[] = new char[word.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = word.charAt(i);
			char letter = 0;
			for (int j = 0; j <= i; j++) {

				if (word.charAt(i) == ch[j])
					letter++;
			}

			if (letter == 1)
				System.out.println("Number of Occurrence of " + word.charAt(i) + " is:" + count[word.charAt(i)]);
		}
		return len;
	}

	public static void main(String[] args) {

		String word = "hello";

		findOccuring(word);
	}

}


