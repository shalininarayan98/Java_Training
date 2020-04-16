package aggregation;

public class Patient {

	private String patientName;
	private int age;
	private Bill bill;
	
	public Patient(String patientName, int age, Bill bill) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.bill = bill;
	}
	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
	public int calculateDiscount() {
		
		if(this.bill.getMedicines().length>5) {
			return this.bill.getBillAmount() - (int)(0.05*this.bill.getBillAmount()); 
		}
		
		else {
			return this.bill.getBillAmount();
		}
		
		
	}
	
	

}
