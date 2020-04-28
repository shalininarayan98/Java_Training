package assignmentInheritance;

public class PizzaTester {
	
	private Pizza[] PizzaData;
		
		PizzaTester(Pizza[] parray) {
			this.PizzaData=parray;
	}
		
	public void buyPizza(String name) {

		boolean flag = false;
		
		for (Pizza pizza : PizzaData) {
			if (name.equalsIgnoreCase(pizza.getName())) {
				flag= true;
				break;
			}
		}
		
		if (flag)
			System.out.println("successfully booked");
		else
			System.out.println("Not booked");

	}

	public void buyPizza(String size, int price) {
		
		boolean flag = false;
		
		for (Pizza pizza : PizzaData) {
			if (size.equalsIgnoreCase(pizza.getName()) && price == pizza.getPrice()) {
				flag= true;
				break;
			}

		}
		
		if (flag)
			System.out.println("successfully booked");
		else
			System.out.println("Not booked");
		
	}
	
	
		
		

	public static void main(String[] args) {
	
		Pizza p = new Pizza("Margerita", 10, "small");
		Pizza p1 = new Pizza("Vegetariana", 12, "medium");
		Pizza p2 = new Pizza("Pepperoni", 14, "large");
		
		Pizza[] pizzaList = {p,p1,p2};
		
		PizzaTester t = new PizzaTester(pizzaList);
		
		t.buyPizza("booking 1: " + "Margerita");
		t.buyPizza("booking 2: " + "small", 10);
		
	}

}
