package datatypes_and_variables;

public class StringTwo {

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
	
	public boolean stringsEqual() {
		
		boolean flag = false;
		
		if (this.getWord1().equals(word2)) {
			flag=true;
		}
		
		if(flag) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		
		return flag;
		
	}
	
static class Tester {
		
	public static void main(String[] args) {
		
		StringTwo s2 = new StringTwo();
		
		s2.setWord1("SHAZ");
		s2.setWord2("shaz");
		
		
		s2.stringsEqual();
	}
	

}
}
	
