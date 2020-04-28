package aggregation;

public class Bill {
	
	private int billId;
	private int billAmount;
	private String[] medicines;
	
	public Bill(int billId, int billAmount, String[] medicines) {
		
		this.billId = billId;
		this.billAmount = billAmount;
		this.medicines = medicines;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
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
