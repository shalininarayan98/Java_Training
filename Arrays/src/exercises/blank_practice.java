package exercises;

public class blank_practice {
	public static void main(String[] args) {
		
		int n = 700100;
		int count = 0;
		
		while (n !=0) {
			
			n/=10;
			++count;
		}
		
		System.out.println("number of digits are: " + count);
		
	}

}
