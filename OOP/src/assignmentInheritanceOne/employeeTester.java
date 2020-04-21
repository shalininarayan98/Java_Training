package assignmentInheritanceOne;

public class employeeTester {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(101);
		e.setName("Anil");
		//System.out.println(e.getSalary());
		
		PermanentEmployee pm = new PermanentEmployee();
		pm.setBasicPay(10000);
		pm.setExperience(3);
		pm.setHra(1500);
		System.out.println(e.getSalary());

	}

}
