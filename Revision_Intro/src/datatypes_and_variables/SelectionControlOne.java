package datatypes_and_variables;

public class SelectionControlOne {
	
	private int num1;
	private int num2;
	private int num3;
	private int value;
	
	
	public SelectionControlOne(int num1, int num2, int num3) {
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
	
	public int calculateValue() {
		
		
		if(num1 != 7 && num2 != 7 && num3 !=7) {
			value = num1 + num2 + num3;
			//System.out.println(value);
		}
		
		else if (num1 == 7 && num2 !=7 && num3 !=7) {
			
			value = num2 + num3;
		}
		
		else if (num2 ==7 && num3 !=7) {
			
			value = num3;
		}
		
		else if (num1 ==7 && num2 ==7 && num3 ==7) {
			
			value = -1;
		}

		return value;

	}
	
	
	
	public static void main(String[] args) {
		SelectionControlOne sc = new SelectionControlOne(1, 7, 2);
		
		System.out.println(sc.calculateValue());
		
		
	}

}
