package exercise;

public class operator_precedence {
	
	public static void main (String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;
		int num4 = 20;
		int num5 = 25;
		
		int result1 = num1 + num2 / num3;
		System.out.println("result 1: " + result1);
		
		/*
		 * 5 + 10 / 3
		 * 5 + 3
		 * 8
		 * ==8
		 */
		
		
		
		
		
		int result2 = (num1+num2)/num3;
		System.out.println("result 2: " + result2);
		
		/*
		 * (5+10)/15
		 * 15/15
		 * 1 
		 * ==1
		 */
		
		
		
		
		
		int result3 = num1 + num2 * num4 - num5 / num3;
		System.out.println("result 3: " +  result3);
		
		/*
		 * 5 + (10*20) - 25 / 15
		 * 5 + 200 - 1
		 * 204
		 * ==204
		 * 
		 * 
		 */
		
		
		
		int result4 = ((num1 + num2) * num4 - num5) / num3;
		System.out.println("result 4: " + result4);
		
		
		/*((5 + 10) * 20 - 25) / 15
		 * (15 * 20 - 25) / 15
		 * (300 - 25) / 15
		 * 275/15
		 * 18
		 * ==18
		 * 
		 */
		
				

		int result5 = num1++ - num2 * 7 / --num2 + num1 * 10;
		System.out.println("result 5: " + result5);
		
		/*
		 *5 - 10 * 7 / 9 + 6 * 10
		 *5 - 70 / 9 + 6 * 10
		 *5 - 7 + 60
		 *-2 + 60
		 *58
		 *
		 * 
		 */
		
		
	}

}
