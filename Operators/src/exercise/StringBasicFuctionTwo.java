package exercise;

public class StringBasicFuctionTwo {

	public static void main(String[] args) {
		String word1 = "Flying";
		String word2 = "FLYinG"; 
		
		if (word1.equalsIgnoreCase(word2)) {
			System.out.print("The strings are equal");
		}
		
		else {
			System.out.print("The strings are not equal");
		}

	}

}
