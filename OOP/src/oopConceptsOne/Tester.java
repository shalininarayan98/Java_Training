package oopConceptsOne;

public class Tester {
	
	public static void main(String[] args) {
		
		Address newAdd = new Address("45 Reduish Close", "Furzton", "Milton Keynes", "Buckinghamshire", 7001);
		
		RRAccount aa1 = new RRAccount("Shalini", newAdd, 500.00);
		
		System.out.println("Name: " + aa1.getCustomerName());
		System.out.println("Deposit Amount: " + aa1.getDepositAmount());
		System.out.println(newAdd.getFirstLine());
		System.out.println(newAdd.getSecondLine());
		System.out.println(newAdd.getCity());
		System.out.println(newAdd.getState());
		System.out.println(newAdd.getPinCode());
		System.out.println(aa1.isValidAddress());
		
		
	}

}
