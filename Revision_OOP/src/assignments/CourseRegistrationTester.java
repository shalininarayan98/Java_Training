package assignments;

public class CourseRegistrationTester {

	public static void main(String[] args) {
		CourseRegistration c1 = new CourseRegistration();
		
		c1.setStudentName("");
		c1.setRegistrationId(10050);
		c1.setQualifyingMarks(80);
		c1.setHostelRequired(true);
		c1.setCourseId(1005);
		
		System.out.println("Name: " + c1.getStudentName());
		System.out.println("Registration number: " + c1.getRegistrationId());
		System.out.println("Mark: " + c1.getQualifyingMarks());
		System.out.println("Hostel required: " + c1.isHostelRequired());
		System.out.println("Course ID: " + c1.getCourseId());
		System.out.println("Course fee: " + c1.calculateCourseFee());
		

	}

}
