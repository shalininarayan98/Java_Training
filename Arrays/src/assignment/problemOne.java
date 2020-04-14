package assignment;


public class problemOne {
	
	public static void main(String[] args) {
		
		int score[] = {281, 344, 265, 272, 236, 324, 287}; 
		
		int sum = 0; 
		int average = 0;
		int count = 0;
		int countEqual=0;
		int countLesser = 0;
		int countGreater = 0;
		
		for (int i=0; i<score.length; i++) {
			
			sum = sum + score[i];
			average = sum/(score.length);
			
		}
		System.out.println("sum is: " + sum);
		System.out.println("average is: " + average);
		
		
		for (int i=0; i < score.length; i++) {
			
			if (score[i]==average) {
				
				countEqual++;
			}
					
		}
		System.out.println("matches having a score equal to average: " + countEqual);
		
		for (int i=0; i < score.length; i++) {
			
			if (score[i]<average) {
				
				countLesser++;
			}
					
		}
		System.out.println("matches having a score smaller than the average: " + countLesser);
		
		for (int i=0; i < score.length; i++) {
			
			if (score[i]>average) {
				
				countGreater++;
			}
					
		}
		System.out.println("matches having a score greater than the average: " + countGreater);
				
	}
						
}