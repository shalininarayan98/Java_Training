package assignmentInheritanceOne;

public class Pizza {

	private String name;
	private int price;
	private String size;
	
	public Pizza(String name, int price, String size) {
		super();
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	
	public Pizza() {
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	

}
