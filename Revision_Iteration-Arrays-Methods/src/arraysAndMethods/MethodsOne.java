package arraysAndMethods;

public class MethodsOne {
	
	private static int n;


	public static int sumOfNumbers(int n) {
		n = 10;
		int sum = 0;
		
		for (int i=0; i<=n; i++) {
			sum = sum + i;
			
		}
		
		return sum;
		
	}
	

	public static void main(String[] args) {
		
		MethodsOne m = new MethodsOne();
		System.out.println(m.sumOfNumbers(n));
		

	}

}
