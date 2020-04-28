package association;

public class CabService {
	
	private String name;
	private int totalNumberOfCars;
	private int numberOfCarsBooked;
	private int price;
	
	

	public CabService(String name, int totalNumberOfCars, int numberOfCarsBooked, int price) {
		this.name = name;
		this.totalNumberOfCars = totalNumberOfCars;
		this.numberOfCarsBooked = numberOfCarsBooked;
		this.price = price;
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




	public int getNumberOfCarsBooked() {
		return numberOfCarsBooked;
	}





	public void setNumberOfCarsBooked(int numberOfCarsBooked) {
		this.numberOfCarsBooked = numberOfCarsBooked;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int calculateExtraPrice(Driver driver) {
		
		
		if (driver.getRating()<=4.5f) {
			return (this.price +(int) (this.price*0.05));
		}
		
		
		return this.price;
	}



}
