package association;

public class CabService {

	private String name;
	private int totalNumberOfCars;
	private int noOfCarsBooked;
	private int price;

	public CabService(String name, int totalNumberOfCars, int numberOfCarsBooked, int price) {
		
		this.name=name;
		this.totalNumberOfCars=totalNumberOfCars;
		this.noOfCarsBooked=numberOfCarsBooked;
		this.price=price;
		
	}
	
	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getTotalNumberOfCars() {

		return totalNumberOfCars;
	}

	public void setTotalNumberOfCars(int totalNumberOfCars) {

		this.totalNumberOfCars = totalNumberOfCars;

	}

	public int getNoOfCarsBooked() {

		return noOfCarsBooked;

	}

	public void setNoOfCarsBooked(int noOfCarsBooked) {

		this.noOfCarsBooked = noOfCarsBooked;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	public int calculateExtraPrice(Driver driver) {
		
		if(driver.getRating()>=4.5f) {
			
			return this.price +(int)(0.05*this.price);
			
		}
		

		return this.price;
	}

}









	

