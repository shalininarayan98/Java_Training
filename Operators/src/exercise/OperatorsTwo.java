package exercise;

public class OperatorsTwo {
	public static void main (String args[]) {
		int num1 = 5;
		int num2 = 10;
		int num3 = 15;
		int num4 = 20;
		int num5= 25;
		
		int sum1 = num1 + num2/ num3;
		int sum2 = (num1+num2)/num3;
		int sum3 = ((num1+num2)*num4-num5)/num3;
		int sum4 = num1++ - num2*7/--num2 + num1 *10;
				
				
				
		System.out.println("first sum:" + sum1);
		System.out.println("second sum:" + sum2);
		System.out.println("third sum:" + sum3);
		System.out.println("fourth sum:" + sum4);
		
	}

}
