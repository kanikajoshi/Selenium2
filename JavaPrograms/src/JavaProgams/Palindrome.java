package JavaProgams;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to be checked");
		
		original = sc.nextLine();
		sc.close();
		
		String reverse="";
		
		int i = original.length()-1;
		int j=0;
		while (i>=0) {
			reverse = reverse+original.charAt(i);
			i--;
			}
		if(reverse.equals(original)) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("no match");
		}
	
	}

}
