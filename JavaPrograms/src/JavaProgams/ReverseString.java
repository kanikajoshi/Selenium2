package JavaProgams;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		String reverse ="";
		int i=str.length()-1;

		
		while(i>=0) {
			
			reverse = reverse+str.charAt(i);
			System.out.println(reverse);
			i--;
			}
		System.out.println(reverse);
		
	}

}
