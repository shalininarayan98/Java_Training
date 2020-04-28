package methodOverloading_Overriding;

public class PannerPizza extends Pizza {
	
	private int price;

	
	public PannerPizza(String name, String size) {
		super(name, size);
		
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public int buyPizza(String size) {
		
		int price;
		
		if (this.getSize().equalsIgnoreCase("Small"))
			price = 100;
		else if (this.getSize().equalsIgnoreCase("Medium"))
			price = 200;
		else if (this.getSize().equalsIgnoreCase("Large"))
			price = 300;
		else
			price = 0;
		
		return price;
	}
	

	}
	
	
	
	
	

