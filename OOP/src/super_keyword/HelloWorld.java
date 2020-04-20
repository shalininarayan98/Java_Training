package super_keyword;

public class HelloWorld {

	public static void main(String[] args) {
		int[] reportee = { 1001 };
		Manager m1 = new Manager(1002, 50000, reportee);
		// m1.setEmpNo(1002);
		// m1.setSal(50000);

		// m1.setReportee(reportee);

		m1.display();

		Employee1 e1 = new Employee1(1001, 20000);
		// e1.setEmpNo(1001);
		// e1.setSal(20000);
		e1.display();

	}

}


