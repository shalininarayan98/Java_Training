package super_keyword;

public class Employee1 {

	/*
	 * Employee1(){ System.out.println("default constructor Employee..."); }
	 */
	Employee1(int empNo, int sal) {
		System.out.println("Employee Constructor called...");
		this.empNo = empNo;
		this.sal = sal;
	}

	public int empNo;
	protected int sal;

	public int getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void display() {
		System.out.println("Employee id: " + this.empNo);
		System.out.println("Sal: " + this.sal);
	}
}

class Manager extends Employee1 {

	Manager(int empNo, int sal, int[] repArr) {
		super(empNo, sal);
		System.out.println("Manager constructor fired..");

		// this.empNo=empNo;
		// this.sal=sal;
		this.reportee = repArr;

	}

	// int empNo;
	/*
	 * public int getEmpNo() { return empNo; } public void setEmpNo(int empNo) {
	 * this.empNo = empNo; }
	 */
	/*
	 * public int getSal() { return sal; } public void setSal(int sal) { this.sal =
	 * sal; }
	 */
	public int[] getReportee() {
		return reportee;
	}

	public void setReportee(int[] reportee) {
		this.reportee = reportee;
	}

	// int sal;
	int reportee[];

	public void display() {
		System.out.println("Manager Details:");
		super.display();
		System.out.println(this.empNo);
		System.out.println(this.sal);
		// System.out.println("Employee no: "+ this.empNo);
		// System.out.println("Sal: "+ this.sal);
		System.out.println("Reportee: ");
		for (int i = 0; i < this.reportee.length; i++) {
			System.out.println(this.reportee[i]);
		}
	}

}
