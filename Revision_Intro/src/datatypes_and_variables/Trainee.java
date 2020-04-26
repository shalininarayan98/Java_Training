package datatypes_and_variables;

public class Trainee {
	
	
	private int SampleImput;


	public int getSampleImput() {
		return SampleImput;
	}


	public void setSampleImput(int sampleImput) {
		SampleImput = sampleImput;
	}

	
	public boolean passCalculator() {
		
		
		
		if (this.getSampleImput()>=65) {
			System.out.println("Trainee has passed");
			return true;
		}
		
		System.out.println("trainee has failed");
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Trainee t = new Trainee();
		
		t.setSampleImput(70);
		System.out.println(t.passCalculator());

	}

}
