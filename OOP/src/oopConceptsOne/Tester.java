package oopConceptsOne;

public class Tester {
	
	public static void main(String[] args) {
		Address newAdd = new Address("45 Reduish Close", "Furzton", "Milton Keynes", "Buckinghamshire", 700100);
		
		RRAccount aa1 = new RRAccount("Shaz", newAdd , 500.00); 
		
		System.out.println(aa1.getCustomerName());
		System.out.println(aa1.getDepositAmount());
		System.out.println(aa1.getAddress());
		System.out.println(aa1.isValidAddress());
		
		
	}
	

	

}
