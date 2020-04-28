package methodOverloading_Overriding;

public class PizzaTester {

	public static void main(String[] args) {
		
		Pizza p = new Pizza("Margerita", "small");
		
		System.out.println(p.buyPizza("small"));
		
		PannerPizza pp = new PannerPizza("Margerita", "small");
		
		System.out.println(pp.buyPizza("small"));

	}

}
