package assignmentInheritanceOne;

public class pizzaTester {

	
	public Pizza[] pizzaData() {
		
		pizzaTester(Pizza[] parray) {
			this.pizzaData=parray;
		}
		
		

		
		
	
	}
	
	
	public void buyPizza(String name) {
		
		Pizza p = new Pizza();
		
		name = p.getName();
	
			
		}
		
		
	
	
	public void buyPizza(int price, String size) {
		
		
	}
	
	public static void main(String[] args) {
		
		Pizza p1 = new Pizza("a", 1, "Small");
		Pizza p2 = new Pizza("b", 1, "Medium");		
		Pizza p3 = new Pizza("c", 1, "Large");
		
		Pizza[] pizzaList = {p1,p2,p3};
		
		pizzaTester t = new pizzaTester(pizzaList);
		
		

	}

}
