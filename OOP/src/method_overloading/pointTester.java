package method_overloading;

public class pointTester {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(2);
		p.setY(3);
		//p.distance();
		System.out.println(p.distance());
		//System.out.println(Math.round(p.distance()));
	
		
		
		Point point = new Point();
		point.setX(5);
		point.setY(6);
		
		System.out.println(p.distance(point));
		//System.out.println(Math.round(p.distance(point)));
		
	}

}
