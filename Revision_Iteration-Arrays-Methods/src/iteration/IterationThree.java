package iteration;

public class IterationThree {

	private int num;
	
	public IterationThree(int num) {
		this.num = num;
	}


	public int getNum() {
		return num;
	}
	
	public int Factorial() {
		
		int number = this.num;
		int factorial=0;
		int count = 0;
		
		/*for (int i=0; i<=number; i++) {
			factorial = i*++count;
		}

		return factorial;*/
		
		for (int i=0; i<number;i++) {
			
			factorial +=4*(Math.pow(2, 3));
		}
		
		return factorial;
	}

	public static void main(String[] args) {
		
		IterationThree i = new IterationThree(5);
		System.out.println(i.Factorial());
	}
		
		

	}


