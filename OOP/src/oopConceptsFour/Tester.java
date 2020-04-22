package oopConceptsFour;

public class Tester {
	
	public static void main(String[] args) {
		
		Loan.getLoanInstance();
		Loan.getLoanInstance();
		System.out.println("total numbe of objects: + " + Loan.getLoanInstance().getClass());
	}
	
}

