package assignment;

public class problemEight {
	
	public static void main (String[] args) {
		
		String str="five"; 
		String[] items = {"two", "three", "one"};
		
		boolean flag=false;
		
		for (int i=0; i<items.length;i++) {
			
			if (items[i]==str) {
				flag=true; break;
				
			}
		}
		
		if(flag) {
			System.out.println("string is found");
			
		} else {
			
			System.out.println("string is not found");
			
		}
	}
}


