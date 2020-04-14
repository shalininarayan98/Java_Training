package assignment;

public class problemSix {

	//public static int findFactorial(int number) {
		//number=0;
	    //return number;
	
	public static void main(String[] args)	{
		int[] numArrays = {145,375,0,100,2};
		System.out.println("strong numbers are: ");
		System.out.println(findStrongNumber(numArrays));
		
		
	}
	
	
	
	public static int findStrongNumber(int[] numArrays) {
		int temp, reminder, j, i, fact;
		int values=0;
		
		for (j = 0; j < numArrays.length; j++) {
			int sum = 0;
			fact = 1;
			i = 1;
			temp = numArrays[j];
			reminder = temp % 10;
			while (i <= reminder) {
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			temp = temp / 10;
			if (numArrays[j] == sum) {
				return (numArrays[j]);
			}
			
		}
		return values;
	}
}

