package assignment;

public class problemFive {
	
	
    public static void main(String []args){
        int year =2000; 
        
       System.out.println(isLeapYear(2020));

        int[] yearArray = { 2016, 2015, 2020, 2019, 2012 };
        
           int[] finalArr =findLeapYear(yearArray);
           
           for(int i=0;i<finalArr.length;i++) {
        	   if(finalArr[i]==0) continue;
        	   System.out.println(finalArr[i]);
           }
           
           
            
            
        }


     

    public static int isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))? 1 : 0;
    }
    
    
    public static int[] findLeapYear(int[] yearArray) {
        int retArr[]=new int[yearArray.length];
    	int j=0;
    	for (int i = 0; i < yearArray.length ; i++) {
    		if (isLeapYear(yearArray[i])==1){
    			//System.out.println();
    			retArr[j++]=yearArray[i];
    			
    		}
    		
    	}
    	
    	return retArr;
		

    }

}
	
	