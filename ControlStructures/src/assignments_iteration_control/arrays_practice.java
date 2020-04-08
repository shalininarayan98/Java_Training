package assignments_iteration_control;

public class arrays_practice {
	
	public static void main (String[] args) {
		
		int list[]= {15,32,14,45,15};
		
		int search=15;
		 
		boolean flag=false;
		
		for (int index=0; index<list.length;index++) {
			
			if (list[index]==search) {
				flag=true; break;
				
			}
		}
		
		if(flag) {
			System.out.println(search + " is available in the list");
			
		} else {
			
			System.out.println(search + " is NOT available in the list");
			
		}
		
	}

}
