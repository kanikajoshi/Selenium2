/**
 * 
 */
package JavaProgams;

/**
 * @author kanika
 *
 */
public class fibnocii {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=0,b=1,c,count=10,i;
		System.out.print(a+" "+b);
		
		for(i=2;i<count-1;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	
	}

}
