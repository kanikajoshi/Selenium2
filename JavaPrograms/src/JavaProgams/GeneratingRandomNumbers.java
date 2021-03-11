package JavaProgams;

import java.util.Random;

public class GeneratingRandomNumbers {
	
	// the number of runs  
    // for the test data generated 
    static int requiredNumbers = 5; 
  
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Random random = new Random(); 
         
	        for(int i = 0; i < requiredNumbers; i++) 
	        { 
	            int a = random.nextInt(10)+1; 
	            System.out.println(a); 
	        } 

	}

}
