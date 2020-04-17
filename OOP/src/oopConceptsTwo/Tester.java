package oopConceptsTwo;

public class Tester {

	public static void main(String[] args) {
		
		Classroom cr = new Classroom();
		cr.setNoOfSeats(100);
		cr.setName("Shaz");
		
		Trainee t = new Trainee();
		t.setClassRoom("Room 1");
		t.setTraineeId(1001);
		
		Admin a = new Admin();
		a.setAdminId(4243);
	
		
			
		System.out.println("Name: " + cr.getName());
		System.out.println("Number of Seats: " + cr.getNoOfSeats());
		System.out.println("Trainee ID: " + t.getTraineeId());
		//System.out.println("Classroom: " + t.getClassRoom());
		System.out.println("Admin ID: " + a.getAdminId());
		System.out.println(a.allocate(t));
		
	}
	
}
