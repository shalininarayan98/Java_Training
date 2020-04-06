package exercise;

public class StringBasicFunctionsOne {
	public static void main (String args []) {
		
		String wordA = "Infosys Ltd ";
		String wordB = "Training";
		String uppercase = wordB.toUpperCase();     
		
		String wordC = (wordA + wordB);  
		
		System.out.println(wordC);
		System.out.println(uppercase);
	}

}

//wordC = wordA.concat(wordB)