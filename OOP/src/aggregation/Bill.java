package aggregation;

public class Bill {

	private int bill;
	private int billAmount;
	private String[] medicines;
	
	
	public Bill(int billId, int billAmount, String[] medicines) {
		
		super();
		this.bill=billId;
		this.billAmount=billAmount;
		this.medicines=medicines;
	}
	
	
	public int getBill() {
		return bill;
	}


	public void setBill(int bill) {
		this.bill = bill;
	}


	public int getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}


	public String[] getMedicines() {
		return medicines;
	}


	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

}
