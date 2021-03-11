/**
 * 
 */
package selenium;

import java.util.Scanner;

/**
 * @author kanika
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	String original,reverse="";
	
	System.out.println("Enter a String");
	original = in.nextLine();
	
	int length =original.length();
	
	for(int i = length-1;i>=0;i--) {
	
	reverse = reverse + original.charAt(i);
		
		
	}

	
	System.out.println(reverse);
}
}