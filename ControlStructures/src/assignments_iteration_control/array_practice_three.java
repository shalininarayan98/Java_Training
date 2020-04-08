package assignments_iteration_control;

public class array_practice_three {
	
	public static int[] BubbleSort(int[] arr) {

		int temp;
		for(int outerLoop=0; outerLoop<arr.length-1;outerLoop++) {
			
			for(int innerLoop=0; innerLoop<arr.length-outerLoop-1;innerLoop++) {
				if (arr[innerLoop]>arr[innerLoop+1]) {
					//swap
					temp=arr[innerLoop];
					arr[innerLoop]=arr[innerLoop+1];
					arr[innerLoop+1]=temp;
				}
				
				
			}
			
		}
		
		
		
		return arr;
		
	}
	
	public static void main (String[] args) {
		
		int List[] = {12,39,9,10,45,6,35};
		
		// CAN ALSO COMPARE STRINGS e.g. 
		// String emp[] = {"Wiza", "Alex", "Peter", "Alegender"};
		// emp[0].compareTo("Niki");
		
		List=BubbleSort(List); 
		
		
		/*12, 39, 9, 10, 45, 6, 35
		
		heaviest last: 
		
		12, 9, 10, 39, 6, 35, 45
		
		----
		
		12, 9, 10, 39, 6, 35
		
		heaviest last:
		
		9, 10, 12, 6, 35, 39
		
		---------------------------------
		12, 9, 10, 35, 6, 39
		---
		12, 9, 10, 6, 35
		---
		9, 6, 10, 12,
		----
		9,6,10
		---
		6,9
		---
		6
		
		
		*/
		
		/*int temp;
		for(int outerLoop=0; outerLoop<List.length-1;outerLoop++) {
			
			for(int innerLoop=0; innerLoop<List.length-outerLoop-1;innerLoop++) {
				if (List[innerLoop]>List[innerLoop+1]) {
					//swap
					temp=List[innerLoop];
					List[innerLoop]=List[innerLoop+1];
					List[innerLoop+1]=temp;
			}
				
				
			}
			
		}*/
		
		
		
		
		/*int temp;
		for (int innerLoop=0; innerLoop<List.length-1; innerLoop++) {
			
			if (List[innerLoop]>List[innerLoop+1]) {
				//swap
				temp=List[innerLoop];
				List[innerLoop]=List[innerLoop+1];
				List[innerLoop+1]=temp;
			}
			
		}*/ 
		
		for (int index=0; index<List.length;index++) {
			System.out.println(List[index]);
			
		}
		
	}

}
