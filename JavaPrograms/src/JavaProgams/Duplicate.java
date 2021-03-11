package JavaProgams;

public class Duplicate {

	public static void main(String[] args) {
		
		//Finding duplicates in array 
		
		
		int In [] = {1,2,3,4,5,6,3};
			
		for(int i=0;i<In.length;i++) {
			
			for(int j=i+1;j<In.length;j++) {
				
					if(In[i]==In[j]) {
						System.out.println("the value of duplicate is "+In[j]);
						
					
				}
			}
		}
			
			
			
		}
	
	}


