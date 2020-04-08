package assignments_iteration_control;

public class arrays_practice_two {

	public static boolean linearSearch(int[] arr,int key) {
		
		for (int index=0; index<arr.length;index++) {
			
			if (arr[index]==key) {
				return true; 
				
			}
		}
		
		return false; 	
	}
	
	public static void main (String[] args) {
		
		int list[]= {15,32,14,45,15};
		
		int search=75, count=0;
		 
		boolean flag=false;
		
		/*for (int index=0; index<list.length;index++) {
			
			if (list[index]==search) {
				flag=true; count++;
				
			}
		}*/
		
		flag=linearSearch(list,search);
		
		if(flag) {
			System.out.println(search + " is available in the list ");
			
		} else {
			
			System.out.println(search + " is NOT available in the list");
			
		}
		
	}

}

