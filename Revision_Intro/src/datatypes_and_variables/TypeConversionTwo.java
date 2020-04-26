package datatypes_and_variables;

public class TypeConversionTwo {

	private int billId;
	private int customerId;
	private double billAmount;
	private final double DISCOUNT = 0.02;
	
	public TypeConversionTwo(int billId, int customerId, double billAmount) {
		this.billId = billId;
		this.customerId = customerId;
		this.billAmount = billAmount;
	}

	public int getBillId() {
		return billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public double getBillAmount() {
		return billAmount;
	}
	
	public double discountedBill() {
		
		double discountedBill;
		
		discountedBill = (this.getBillAmount()-this.getBillAmount()*DISCOUNT);
		
		return discountedBill;
		
	}

	public static void main(String[] args) {
		
		TypeConversionTwo t = new TypeConversionTwo(1001, 101, 199.99);
		
		//t.discountedBill();
		System.out.println("Bill ID: " + t.getBillId());
		System.out.println("Bill amount: " + t.getBillAmount());
		System.out.println("discounted bill: " + t.discountedBill());

	}

}
