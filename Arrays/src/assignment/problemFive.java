package assignment;

public class problemFive {
	
	
    public static void main(String []args){
        int year =2000; 
        int[] yearArray = { 2013, 2015, 1621, 2019, 2012 };
        
            if(isLeapYear(year)) {
              System.out.println(true);
            }
            
            else {
              System.out.println(false);
              
        }
            
            
        }


     

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
    
    
    public static boolean findLeapYear(int[] yearArray) {
        
    	
    	for (int i = 0; i <= yearArray.length - 1; i++) {
    		if ((yearArray[i] % 4 == 0) && (yearArray[i] % 100 != 0) || (yearArray[i] % 400 == 0));
    		System.out.println();
    	}
		

    }

}
	
	