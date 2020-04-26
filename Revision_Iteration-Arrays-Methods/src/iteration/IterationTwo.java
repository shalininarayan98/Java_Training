package iteration;

public class IterationTwo {
	
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String seperateLine() {
		
		word = this.getWord();
 		
		for(int i = 0; i<word.length();i++) {
			System.out.println(word.charAt(i));
		}
		return word;
	
	}
	

	public static void main(String[] args) {
		
		IterationTwo i = new IterationTwo();
		
		i.setWord("hello");
		
		System.out.println(i.seperateLine());

	}

}
