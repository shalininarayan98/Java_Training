
public class ExceptionDemob {

	public static void main(String[] args) {
		
		int i=10, j=0, k;
		int a[] = null;
		j=j%10;
 		
		try {
			k=i/j;
		}catch(Exception e) {
			
		}
		
		//get error for this sysout
		//System.out.println(k);
		//get error again 
		//System.out.println(a[0]);
		
		
		//handle the exception like this:
		try {
			System.out.println(a[0]);
		}catch(Exception e) {
			System.out.println("you have not handled null senario");
			a = new int[5];
		}
		
		System.out.println("terminated normally");
		
		//can you exception handling when it is a problem programmer can't handled
		//network connection problem- fault of network not fault of programme
		//you do not come to know in advance if it will be a problem or not
		
		//runtime error =  unchecked 
		
		//e.printStackTrace
		//e.getMessage
	}

}
