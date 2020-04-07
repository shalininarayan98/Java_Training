package assignments_variables_etc;

public class problemEight {
	
	public static void main (String[] args) {
		
		int one_dollar_count = 0;
		int five_dollar_count = 0;
		int amount_made = 0;
		
		//float five_dollar_remainder = five_dollar_count*5>=amount_made
		
		//five_dollar_used = (five_dollar_count % 5 == 0);
		
		//if (five_dollar_used<=five_dollar_count) {
			
			//System.out.println("five dollars needed "+ five_dollar_count-five_dollar_used);
		
		if (amount_made % 5 == 0 && (five_dollar_count>=(amount_made/5))) {
		
			System.out.println(five_dollar_count/5);
					
		}
		
		else if (amount_made % 5 != 0 && ((amount_made-five_dollar_count*5)<=one_dollar_count)) {
			
			System.out.println("five dollar count is " + (five_dollar_count) + " and the one dollar count is " + (amount_made-five_dollar_count*5));
					
		}
		
		else
			System.out.println(-1);

				
		
	}

}
