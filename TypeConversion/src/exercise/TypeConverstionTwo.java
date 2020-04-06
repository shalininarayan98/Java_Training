package exercise;

public class TypeConverstionTwo {
	public static void main (String[]args) {
		
		double billAmount = 199.99;
		int billId=1001, customerId=101, discount=2;
		
		double discountedBillAmount = billAmount-billAmount*(discount/100);
		
		System.out.println(discountedBillAmount);
			
		
		
	}
}
