package JavaProgams;

import java.util.Random;

public class GeneratingRandomArrays {
	
	// the number of runs  
    // for the test data generated 
    static int RUN = 5; 
  
    // miminum range of random numbers 
    static int lowerBound = 0; 
  
    // maximum range of random numbers 
    static int upperBound = 1000; 
  
    // miminum size of reqd array 
    static int minSize = 10; 
  
    // maximum size of reqd array 
    static int maxSize = 20; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random random = new Random(); 
		  
	        for(int i = 0; i < RUN; i++) 
	        { 
	            int size = random.nextInt(maxSize)+minSize; 
	            
	  
	            for(int j = 0; j < size; j++) 
	            { 
	                int a = random.nextInt(100);
	                System.out.print(a + " "); 
	            } 
	            System.out.println(); 
	        } 
	}

}
