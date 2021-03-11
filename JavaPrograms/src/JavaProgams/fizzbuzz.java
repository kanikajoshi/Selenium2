package JavaProgams;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*Write a program that prints the numbers from 1 to 100. 
	 But for multiples of three print “Fizz” 
	 instead of the number and for the multiples of five print “Buzz”. 
	For numbers which are multiples of both three and five print “FizzBuzz”.*/
		
		for(int i =1;i<=100;i++) {
			if(i%3==0 && i%5==0){
				System.out.print("For "+i+"  its  ");
				System.out.print("FizzBuzz");
				System.out.println();
				
				}
			else if(i%5==0){
			System.out.print("For "+i+"  its  ");
			System.out.print("Buzz");
			System.out.println();
			}
			else if(i%3==0){
				System.out.print("For "+i+" its  ");
				System.out.print("Fizz");
				System.out.println();
				}
			
			else{
				System.out.println("For "+i+" Its nothing");
				}
				
		}

	}

}
