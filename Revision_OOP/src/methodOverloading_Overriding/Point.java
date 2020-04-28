package methodOverloading_Overriding;

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
	
	public double distance(Point point) {
		
		
		double xValue=((this.getX()-point.x)*(this.getX()-point.x));
		
		double yValue=((this.getY()-point.y)*(this.getY()-point.y));
		
		
		double distance = Math.sqrt(xValue+yValue);
		
		return Math.round(distance);
		
	}

}
