package datatypes_and_variables;

public class Chocolates {

	private int noOfChocolates;
	private final double PRICE = 2.9;
	
	
	public int getNoOfChocolates() {
		return noOfChocolates;
	}

	public void setNoOfChocolates(int noOfChocolates) {
		this.noOfChocolates = noOfChocolates;
	}

	public double calculatePrice() {
		
		double totalPrice;
		
		totalPrice = this.getNoOfChocolates()*PRICE; 

		return totalPrice;

	}
	
static class Tester {
	
	public static void main(String[] args) {
	
		Chocolates c = new Chocolates();
		
		c.setNoOfChocolates(10);
		
		System.out.println(c.calculatePrice());
		
		
	}
	
	
}

}
