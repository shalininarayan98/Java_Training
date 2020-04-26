package datatypes_and_variables;

public class SelectionControlTwo {
	
	private int num1;
	private int num2;
	private int num3;
	private int maxValue;
	
	
	public SelectionControlTwo(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int getNum3() {
		return num3;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public int calcMaxValue() {
		
		if (num1>num2 && num1>num3) {
			maxValue = num1;
		}
		
		else if (num2>num1 && num2>num3) {
			maxValue = num2;
		}
		
		else if (num3>num1 && num3>num2) {
			maxValue = num3;
		}

		return maxValue;
	}
	
	
	public static void main(String[] args) {
		
		SelectionControlTwo sc2 = new SelectionControlTwo(45, 88, 10);
		System.out.println(sc2.calcMaxValue());
		
	}
	
	
	
	
}
