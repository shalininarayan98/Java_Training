package finalExercise;

public class Employee {

	private String name;
	private int score;
	private int BASESALARY=15000;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int calculateFinalSalary(int score) {
		
		int bonus = 0;
		
		if (this.getScore()>0) {
			if (this.getScore()>=92)
				bonus = 10000;
			else if (this.getScore()>=80)
				bonus = 5000;
			else if (this.getScore()>=70)
				bonus = 1000;
			else if (this.getScore()>70)
				bonus = 0;
		}
			
		return bonus+BASESALARY;
	}

}
