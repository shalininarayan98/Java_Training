package datatypes_and_variables;

public class StringOne {

	private String word1;
	private String word2;
	
	
	public String getWord1() {
		return word1;
	}
	public void setWord1(String word1) {
		this.word1 = word1;
	}
	public String getWord2() {
		return word2;
	}
	public void setWord2(String word2) {
		this.word2 = word2;
	}
	
	public void upperCase() {
		
		String uppercaseWord2;
		
		uppercaseWord2 = this.getWord2().toUpperCase();
		System.out.println(uppercaseWord2);
		
		String word3 = (this.getWord1()+this.getWord2());
		System.out.println(word3);
		
	}
	
static class Tester {
		
	public static void main(String[] args) {
		
		StringOne s = new StringOne();
		
		s.setWord1("hi");
		s.setWord2("shaz");
		
		
		s.upperCase();
	}
	

}
}
