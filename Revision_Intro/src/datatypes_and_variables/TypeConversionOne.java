package datatypes_and_variables;

public class TypeConversionOne {
	
	private final float PI = 3.14f;
	private float radius;
	private float area;
	
	public TypeConversionOne(float radius) {
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public int calculateArea(){
		
		this.area = (PI * this.radius*this.radius);
		System.out.println(this.area);
		return (int) this.area;
	}

	
	public static void main(String[] args) {
		
		TypeConversionOne t = new TypeConversionOne(2.0f);
		
		t.calculateArea();
		
		
	}
	
	

}
