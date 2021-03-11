package JavaProgams;

public class fibnociiRecursion {

	
	public static int fib(int n)
	{
		if(n<2)
			return n;
		else {
		return fib(n-1) + fib(n-2);
		}
		
	}

	public static void main(String args[]) {
		
		int n=10,i=0;
		
		while(i<=n){
		System.out.print("  "+fib(i));
		i++;
		}
		
	}

}
