package datatypes_and_variables;

public class trapezoid {

	private int base1;
	private int base2;
	private int height;
	private float area;
	private  final static float HALF = 0.5f;
	
	public trapezoid(int base1, int base2, int height) {
	
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}
	
	public int getBase1() {
		return base1;
	}

	public int getBase2() {
		return base2;
	}

	public int getHeight() {
		return height;
	}
	
	public float calcArea() {
		
		area = HALF * (getBase1()+this.getBase2()) * this.getHeight();

		return area;
		
	}

	public static void main(String[] args) {
		
		trapezoid t = new trapezoid(1, 5, 10);
		
		System.out.println(t.calcArea());
		
		

	}

}
