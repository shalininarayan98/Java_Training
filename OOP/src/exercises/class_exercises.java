package exercises;

public class class_exercises {

	// NOTES

	/*
	 * ABSTRACION only give small amount of detail don't show everything only show
	 * the required details e.g. for learning the drive you don't need to know the
	 * engineering of it good for solving complex problems- can use other parts but
	 * not concerned with everything
	 * 
	 */

	/*
	 * ENCAPSULATION hiding a few things so it is not available to all objects
	 * public-available to outside world private-not available to outside world-
	 * requires authentication to change it
	 * 
	 */

	/*
	 * POLYMORPHISM two methods with same name but both do different jobs same name-
	 * do different things can also serve many different functions same name
	 * different behaviour depending on the context
	 */

	/*
	 * RELATIONSHIP employee will have relationship with manager employee isn't an
	 * individual entity in the system , it is related to manager
	 */

	/*
	 * primitive data type = fixed location non primitive = not fixed- points to a
	 * location employee: name/number/salary/address/ etc...
	 * name/number/salary/address/ = ATTIBUTES (where to store and how much)
	 * behaviour can think of some chunk of memory to store all of this information
	 * eg name/ num CAN'T use array; not all the same datatpes name = string, salary
	 * = float so can't use array to store employee so must create a class, them
	 * define the structure of the class create a user defined data type new =
	 * dynamic memory allocation the use a constructor (Employee();) so alex is also
	 * pointing to the memory location where the attributes are stored
	 */

	public static void main(String[] agrs) {

		int arr[] = new int[10];
		Employee Alex = new Employee();

	}

	/*STACK = in main you may call another method
	 *it is a data structure which can be compared to a stack of books
	 *take book that is on the top; so the book on the top change
	 *last in (whichever has been put first in) and it will be 
	 *the first out
	 *take a plate that is on the top
	 *similarly if you put a plate in you put it on the top not in the 
	 *middle
	 *LIFO (last in first out)
	 */
	
	public static void displayagain () {
		int z = 5;
	
	}
	
	public static void display () {
		int x=5;
		
		displayagain();
		System.out.println(x);
	}
	
	public static void main1 (String[] args) {
		int y;
		y=100;
		display();
		//displayagain();
		System.out.println();
		
	}
	
	
	 /*HEAP = dynamic memory allocation 
	 *you know memory location is somewhere else 
	 *you need some space but not sure how big it will be 
	 *garbage collector will collect all unused space 
	 *
	 * 
	 */
	 
	public static void main3(String[] agrs) {
		int y;
		
		int arr[] = new int[10];
		Employee Alex = new Employee();
		display();
		System.out.println();
		
		// if Alex=null then there is nothing pointing to the memory location
		// so it is a waste of space so this will be collected by the garbage collector

	}
	
	

}
