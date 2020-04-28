package methodOverloading_Overriding;

public class Pizza {

	private String name;
	private String size;
	
	public Pizza(String name, String size) {
	
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public int buyPizza(String size) {
		
		int price;
		
		if (this.getSize().equalsIgnoreCase("Small"))
			price = 50;
		else if (this.getSize().equalsIgnoreCase("Medium"))
			price = 100;
		else if (this.getSize().equalsIgnoreCase("Large"))
			price = 150;
		else
			price = 0;
		
		return price;
		
	}
	
	
	
}
