package assignments_variables_etc;

public class problemFour {
	
	public static void main (String[] args) {
		
		int flights_take_off = 100;
		int flights_landed = 110;
		int seating_capacity_take_off = 150;
		int seating_capacity_landed = 186;
		
		int cookies_sold = (flights_take_off*seating_capacity_take_off*2)+(flights_landed*seating_capacity_landed);
		
		System.out.println(cookies_sold);
				
		
		
	}

}
