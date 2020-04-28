package assignmentInheritance;

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
		
		double varComp;
		
		int experience = this.getExperience();
		
		if(experience>=10) {
			varComp=0.12;
		}
		
		else if (experience>=5) {
			varComp=0.07;
		}
		
		else if (experience>=3) {
			varComp = 0.05;
		}
		
		else {
			varComp = 0;
		}
		
		double salary = (varComp * this.getBasicPay())+this.getBasicPay()+this.getHra();
		this.setSalary(salary);
		
		}
		
	}

