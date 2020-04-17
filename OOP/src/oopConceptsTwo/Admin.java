package oopConceptsTwo;

public class Admin {

	private int adminId;
	private Classroom classRoom;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Classroom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}
	
	
	public int allocate(Trainee trainee) {

		System.out.println("Classroom: " + trainee.getClassRoom());
		
		int last = 0;
		if (trainee.getTraineeId()>=0) {
		
			last = (trainee.getTraineeId() % 10);
		}
		
		
		System.out.println("Number of seats left is: ");
		return ((100-last));

			
		}

	}

	
	

