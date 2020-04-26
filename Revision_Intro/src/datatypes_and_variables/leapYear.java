package datatypes_and_variables;

public class leapYear {
	
	private int leapYear;
	
	public leapYear(int leapYear) {
		this.leapYear = leapYear;
	}

	public int getLeapYear() {
		return leapYear;
	}

	public boolean isLeapYear() {
		
		leapYear = this.getLeapYear();
		
		boolean flag = false;
		
		if ((leapYear % 4 == 0) && (leapYear % 100!= 0) || (leapYear % 400 == 0)) {
			flag=true;
		}
		 
		if(flag) {
			 
			System.out.println("it is a leap year");
		 }
		else {
			System.out.println("not a leap year");
		}
		
		return flag;
		
		
	}

	public static void main(String[] args) {
		
		leapYear lp =  new leapYear(2000);
		
		System.out.println(lp.isLeapYear());

	}

}
