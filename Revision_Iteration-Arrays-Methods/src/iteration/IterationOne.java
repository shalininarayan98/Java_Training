package iteration;

public class IterationOne {
	
	private int num;
	
	public IterationOne(int num) {
		this.num = num;
	}


	public int getNum() {
		return num;
	}
	
	public int Total() {
		
		int number = this.num;
		int count = 0;
		
		for (int i=1; i<=number; i++) {
			count = count + i;		
		}

		return count;
	}

	public static void main(String[] args) {
		
		IterationOne i = new IterationOne(5);
		System.out.println(i.Total());
	}

}
