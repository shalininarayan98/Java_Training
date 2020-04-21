package assignmentInheritanceOne;

public class NKShop {
	
	private int itemId;
	private String brandName;
	private int size;
	private String itemType;
	
	public void calculatePrice(int itemId) {
		this.itemId = itemId;
		int price = 0;
	
		switch (this.itemId) {
		
		case(1001):
			price = 1200;
			break;
		case(1002):
			price = 1000;
			break;
		case(1003):
			price = 999;
			break;
		case(1004):
			price = 1500;
			break;
		default:
			System.out.println("Invalid Item ID!");
		
		}
		
		System.out.println("The price for the item is: " + price);
		

		}
 
	
	public void calculatePrice(String brandName, String itemType, int size) {
		
		this.brandName=brandName;
		this.itemType=itemType;
		this.size=size;
		
		
		int price = 0;
		
		if (size==32 || size==34 && brandName == "Puma" && itemType == "T-shirt") {
			price = 1200;
		}
		else if (size==32 || size==34 && brandName == "Puma" && itemType == "Skirt") {
			price = 1000;
		}
		else if (size==32 || size==34 && brandName == "Reebok" && itemType == "T-shirt") {
			price = 999;
		}
		else if (size==32 || size==34 && brandName == "Reebok" && itemType == "Skirt") {
			price = 1500;
		}
		
		System.out.println("The price for the item is: " + price);
		
	}
	
	public static void main(String[] args) {
		
		
		NKShop s = new NKShop();
		s.calculatePrice(1004);
		
		s.calculatePrice("Puma", "Skirt", 32);
	}
	
	

}
	
