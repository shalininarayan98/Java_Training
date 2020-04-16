package association;

public class Tester {
	
	public static void main(String[] args) {
		
		CabService cs = new CabService("Wala", 4, 3, 200);
		Driver d = new Driver("Vasanth", 4.6f);
		System.out.println(cs.calculateExtraPrice(d));	
		
	}

}
