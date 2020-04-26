package iteration;

public class AssignmentOne {
	
	private int num;

	public AssignmentOne(int num) {
	
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}



	public int calcFactorial() {
		
		int factorial = 1;
		
		int number = this.getNum();
		
		for(int i = 1; i<=number;i++) {
		
			factorial = factorial *i;	
		}
		
		
		return factorial;
	}


	public static void main(String[] args) {
		
		AssignmentOne o = new AssignmentOne(5);
		System.out.println(o.calcFactorial());

	}

}
