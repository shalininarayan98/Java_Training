package assignmentOOP1;

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
	
	public int allocate(Trainee trainee)  {
		
		this.classRoom.setNoOfSeats(this.classRoom.getNoOfSeats()-1);
		
		trainee.setClassRoom(this.classRoom.getName());
		
		return this.classRoom.getNoOfSeats();
		
	}

}
