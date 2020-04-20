package method_overloading;

public class Point {
	
	private double x;
	private double y;
	
	public Point() {
		
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double distance() {
		
		double dist;
		
		//origin x1=0, y1=0
		
		dist = Math.sqrt(this.x * this.x + this.y * this.y);
		
		return dist;
		
	}
	
	public double distance(Point p) {
		
		double dist1;
		dist1=Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		
		return dist1;
		
		
	}
	

}
