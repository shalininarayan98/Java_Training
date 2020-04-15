package assignments;

public class CourseRegistration {

	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseID;
	private boolean hostelRequired;
	private double discount;

//STUDENTNAME
	public String getStudentName() {

		return this.studentName;
	}

	public void setStudentName(String studentName) {

		this.studentName = studentName;

	}

//REGISTRATION ID
	public int getRegistrationId() {

		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {

		this.registrationId = registrationId;

	}

//QUALIFYING MARKS
	public float getQualifyingMarks() {

		return this.qualifyingMarks;
	}

	public void setQualifyingMarks(float qualifyingMarks) {

		this.qualifyingMarks = qualifyingMarks;
	}

//COURSE ID

	public int getCourseId() {

		return this.courseID;
	}

	public void setCourseId(int courseId) {

		this.courseID = courseId;
	}
	
	public double getDiscount() {
		
		return this.discount;
	}

//HOSTNAME

	public void setHostelRequired(boolean hostelRequired) {

		this.hostelRequired = hostelRequired;

	}

//COURSEFEE

	public double getCourseFee() {

		return this.courseFee;
	}

//IS HOSTEL REQUIRED BOOLEAN

	public boolean isHostelRequired() {

		return true;
	}

//VALIDATE MARKS

	public boolean validateMarks() {

		//int discount = 0;

		if (this.qualifyingMarks >= 0 && this.qualifyingMarks <= 100);
		return true;

	}

//VALIDATE COURSE ID

	public boolean validateCourseId() {

		if (this.courseID >= 1001 && this.courseID <= 1005)
			;
		return true;

	}

//CALCULATE COURSE FEE

	public double calculateCourseFee() {

		int discount = 0;
		double fee = 0;


		if (validateCourseId() == true && validateMarks() == true) {

			if (this.qualifyingMarks >= 64) {
				this.discount = 0;
			}

			else if (this.qualifyingMarks >= 65) {
				this.discount = 5;
			}

			else if (this.qualifyingMarks >= 70) {
				this.discount = 10;
			}

			else if (this.qualifyingMarks >= 85) {
				this.discount = 15;
			}
			
			
			
			switch (this.courseID) {

			case (1001):
				fee = 55000;
				break;

			case (1002):
				fee = 35675;
				break;

			case (1003):
				fee = 28300;
				break;

			case (1004):
				fee = 22350;
				break;

			case (1005):
				fee = 115000;
				break;
			}

			//this.courseFee = (fee * discount)/100;
			//return courseFee;
			//this.courseFee = fee;
			//System.out.println(fee);
			
			
			this.courseFee = (fee*this.discount)/100;
			
		}
		return fee;

	}
}

	
	


