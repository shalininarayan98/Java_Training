package exercise;

public class classMarks {

	private String name;
	private int score;
	private int age;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setAge(int age) {
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

static class Tester {
	
	public static void main(String[] args) {
		
		classMarks s = new classMarks();
		
		s.setAge(18);
		s.setName("Shaz");
		s.setScore(80);
		
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.Marks());

	}

}
	

}
