package RevisionDay1;

import java.util.Scanner;

public class Paindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1 = sc.nextLine();
		sc.close();
		String str2="";
		
		for(int i= str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
			
		}
		if(str1.equals(str2)) {
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("No match");
		}
		
	}

}
