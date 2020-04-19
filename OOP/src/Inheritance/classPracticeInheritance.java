package Inheritance;

public class classPracticeInheritance {
	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		
		Manager1 m1 =new Manager1();
		
		e1.setEmpNo(1001);
		e1.setSal(20000);
		
		m1.setEmpNo(1002);
		m1.setSal(50000);
		
		int[] reportee = {1001,1002};
		m1.setReportee(reportee);
		
		System.out.println("Manager details: ");
		/*System.out.println(m1.getEmpNo());
		System.out.println(m1.getSal());
		
		int[] reports = m1.getReportee();
		for(int i=0; i<reports.length;i++) {
			System.out.println(reports[i]);
		}*/
		
		m1.display();
		
		//System.out.println(m1.getReportee());
		
		
		System.out.println("Employee details: ");
		System.out.println(e1.getEmpNo());
		System.out.println(e1.getSal());
		
	}

	
}
	//code reusability is inheritance 
	//this is without inheritance 

	class Employee1{

		int empNo;
		int sal;
		
		public int getEmpNo() {
			return empNo;
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
		
		public void display () {
			System.out.println("Employee ID: " + this.empNo);
			System.out.println("Employee ID: " + this.sal);
		}
	}



	class Manager1 extends Employee1 {
		

		int empNo;
		int sal;
		int reportee[];
		
		/*public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}*/
		
		
		public int[] getReportee() {
			return reportee;
		}
		public void setReportee(int[] reportee) {
			this.reportee = reportee;
		}
		
		public void display() {
			System.out.println("Mananger Details: ");
			//System.out.println("Employee no.: " + this.empNo);
			//System.out.println("Salary " + this.sal);
			//System.out.println("Reportee: " + this.reportee);
			for(int i=0; i<this.reportee.length;i++) {
				System.out.println(this.reportee[i]);
			}
		}
		
		
		
	}




