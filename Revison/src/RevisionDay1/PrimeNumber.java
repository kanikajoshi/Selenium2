package RevisionDay1;

public class PrimeNumber {

	public static void main(String[] args) {

		for(int i = 1;i<101;i++) {
			int flag= 0;
			for(int j =2;j<i;j++) {

				if(i!=j) {
					if(i%j==0) {
						flag=1;
							  }
					     }
								}//end of for j loop
			if(flag==0) {
							System.out.println(i+" is prime");
			            }	
			else
			{
				System.out.println(i+"  is not prime");
			}
		}//end of for i loop



	}//end of main

}//end of class
