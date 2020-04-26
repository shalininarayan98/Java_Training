package datatypes_and_variables;

public class StudentMarks {

	private String name;
	private int score;
	private int age;
	
	public StudentMarks(String name, int score, int age) {
		this.name = name;
		this.score = score;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public int getAge() {
		return age;
	}

	public boolean Marks(){
		
		boolean flag = false;
		
		if((this.getScore()>=80) && this.getAge()>=18) {
			flag=true;
		}
		
		if(flag) {
			System.out.println("You are eligible for admission!");
		}
		else {
			System.out.println("You are not eligible");
		}
		
		return flag;
	}

class Tester {
	
	public void main(String[] args) {
		
		StudentMarks s = new StudentMarks("Shaz", 80, 18);
		
		System.out.println(s.Marks());
		System.out.println("marks");
		System.out.println(s.name);
	}

}
	

}
