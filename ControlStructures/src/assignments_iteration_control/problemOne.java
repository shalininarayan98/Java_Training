package assignments_iteration_control;

public class problemOne {
	
	public static void main (String [] args) {
		
		int input = 5;
		int factorial = 1;
		
		for(int i = 1; i <= input; i++) {
			
			factorial = factorial * i;
	
			}
    System.out.println("The factorial for " + input + " is: " + factorial);
    
    
    /*int n=5;
     *int fact=1; 
     * 
     *for (int loop =1; loop<=n; loop++) {
     *		fact=fact*loop;
     *}
     *
     *System.out.println(fact);
     *
     *recurssive functions (when a function calls itself)
     *
     *3! = 1*2*3=2!*3
     *
     *n!=n*(n-1)!
     *fact fun(n) {
     *
     *if (n ==1) || n==0) {
     *  return 1;
     *} 
     *
     *else {
     *  return n* factorial(n-1); 
     * }
     * 
     * 
     *
     *
     *}
     *
     *can also decrement in for loop
     *	
     */
		

}

	
}
