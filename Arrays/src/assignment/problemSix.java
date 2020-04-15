package assignment;

public class problemSix {

	//public static int findFactorial(int number) {
		//number=0;
	    //return number;
	
	
	public static int findFactorial(int number) {
		int fact=1;
		
		for(int i=number;i>0;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	
	public static boolean isStrong(int number){
		int sum=0;
		int newnum=number;
		while(number!=0) {
			sum=sum+findFactorial(number%10);
			number=number/10;
		}
		System.out.println(sum);
		if(newnum==sum) {
			return true;
		} 	
		else {
			return false;
		}
			
		
	}
	
	public static int[] findStrongNumbers(int[] numArrays) {
		int[] retArray=new int[numArrays.length];
		int j=0;
		for(int i=0;i<numArrays.length;i++) {
			if(isStrong(numArrays[i])) {
				retArray[j++]=numArrays[i];
			}
			
			
		}
		
		
		return retArray;
		
	}
	
	public static void main(String[] args)	{
		int[] numArrays = {145,375,0,100,2};
		
		int[] finalArrays=findStrongNumbers(numArrays);
		
		for(int i=0;i<finalArrays.length;i++) {
			if(finalArrays[i]==0)continue;
			System.out.println(finalArrays[i]);
		}
		
	
		
		/*System.out.println("strong numbers are: ");
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
		return values;*/
	}
}

