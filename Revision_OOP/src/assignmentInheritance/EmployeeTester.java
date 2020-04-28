package assignmentInheritance;


public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(101);
		e.setName("Anil");
		
		//System.out.println(e.getSalary());
		
		PermanentEmployee pm = new PermanentEmployee();
	
		pm.setBasicPay(10000);
		pm.setExperience(3);
		pm.setHra(1500);
		pm.getSalary();
		//System.out.println(pm.getSalary());
		System.out.println(pm.getBasicPay());
		System.out.println(pm.getHra());
		System.out.println(pm.getSalary());
		
		ContractEmployee ce = new ContractEmployee();
		//ce.setHours(10);
		//ce.setWages(10);
		//ce.getSalary();

	}

}
