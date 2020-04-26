package arraysAndMethods;

public class AssignmentOne {
	
	public static int getAvergae(int score[]) {
		
		int average=0;
		int total = 0;
		
		for (int i=0; i< score.length; i++) {
			
			total= total + score[i];	
			average = total/score.length;	
		}
		
		return average;

		
	}
	

	public static void main(String[] args) {
		
		int score[] = {281, 344, 265, 272, 236, 324, 287};
		
		getAvergae(score);
		
		System.out.println(getAvergae(score));
		
		int count =0;
		int greater = 0;
		int equals = 0;
		int lesser=0;
				
		
		for (int i=0; i< score.length; i++) {
			if (score[i]>getAvergae(score)) {
				greater++;
			}
			
			else if (score[i]==getAvergae(score)) {
				equals++;
			}
			
			else if (score[i]<getAvergae(score)) {
				lesser++;
			}
			
		}
		
		System.out.println(greater);
		System.out.println(equals);
		System.out.println(lesser);
		

	}

}
