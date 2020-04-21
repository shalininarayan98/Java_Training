package assignmentInheritanceOne;

public class PermanentEmployee extends Employee {

	private double basicPay;
	private double hra;
	private int experience;
	
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void calculateSalary() {
		
		int variable_component = 0;
		
		if (this.experience<3) {
			variable_component = (int)(0*this.basicPay);
		}
		else if (this.experience>=3 && this.experience>5) {
			variable_component = (int)(0.5 * this.basicPay);
		}
		else if (this.experience>=5 && this.experience>10) {
			variable_component = (int)(0.07 * this.basicPay);
		}
		else if (this.experience>=10) {
			variable_component = (int)(0.12 * this.basicPay);
		}
		
		double salary = this.getSalary();
		
		salary = (variable_component + this.basicPay + this.hra);
		
		
		
		
	}

}
