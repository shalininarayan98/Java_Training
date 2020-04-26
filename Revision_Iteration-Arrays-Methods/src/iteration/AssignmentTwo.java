package iteration;

public class AssignmentTwo {

	private int num;

	public AssignmentTwo(int num) {

		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public int sumDigits() {

		int number = this.getNum();
		int sum = 0;
		int last = 0;

		while (number>0) {
			
			sum = sum +number % 10;
			number = number/10;
		}
		
		return sum;
		}

	public static void main(String[] args) {

		AssignmentTwo t = new AssignmentTwo(512);
		System.out.println(t.sumDigits());

	}

}
