package assignments;

public class CourseRegistration {
	
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	
	public boolean validateMarks() {
		
		if ((this.getQualifyingMarks()<=100) && (this.getQualifyingMarks()>=65))
			return true;
		else 
			return false;
		
	}
	
	public boolean validateCourseId() {
		
		if ((this.getCourseId()<=1005) && (this.getCourseId()>=1001))
			return true;
		else 
			return false;
	}
	
	public double calculateCourseFee() {
		
		double discount = 0;
		double fee = 0;
		
		if (((this.validateCourseId()) && (this.validateMarks())) == true) {
			
			if(this.getQualifyingMarks()==65)
				discount = 0.05;
			else if (this.getQualifyingMarks()==70)
				discount = 0.1;
			else if (this.getQualifyingMarks()==85)
				discount = 0.15;
			
			switch(this.getCourseId()) {
			
			case(1001):
				fee = 55000;
				break;
			case(1002):
				fee=25675;
				break;
			case(1003):
				fee=28300;
				break;
			case(1004):
				fee=22350;
				break;
			case(1005):
				fee=115000;
				break;				
			}
			
			this.courseFee=discount*fee;
		
		}
		
		return fee;
		
		
		
		
	}

}
