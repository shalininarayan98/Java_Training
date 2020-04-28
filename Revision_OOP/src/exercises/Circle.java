package exercises;

public class Circle {
	
	private double radius;
	private double pi;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public double displayArea() {
		
		double area = this.getRadius()*this.getRadius()*this.getPi();
		
		return area;
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setPi(3.14);
		c.setRadius(5);
		
		System.out.println(c.displayArea());

	}

}
