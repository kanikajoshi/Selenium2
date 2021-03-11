package RevisionDay1;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("************************");
		System.out.println("Enter 1 to play Fizzbuzz ");
		int ch = sc.nextInt();

		while(ch==1) {
			switch(ch)
			{
			case 1:
				
				System.out.println("Welcome to Fizzbuzz");
				System.out.println();
				System.out.println("************************");
				System.out.println();
				System.out.println("Enter the number to check ");
				int i = sc.nextInt();
				System.out.println();
				System.out.println("You have entered "+i);
				System.out.println();
				if(i%3==0 && i%5==0) {
					System.out.println("Bingo its a Fizzbuzz !!!!!");
					System.out.println();
				}
				else if(i%3==0){
					System.out.println("Its a Fizz ....Never mind");
					System.out.println();
				}
				else if(i%5==0)	{
					System.out.println("Its a buzz....Not BAd");
					System.out.println();
				}
				else{
					System.out.println("its none...Sorry");
					System.out.println();
				}

			}
			System.out.println("*Would u like to play again*************");
			System.out.println();
			System.out.println("Press 1 to play fizzbuzz****************");
			System.out.println();
			ch = sc.nextInt();
		}
		System.out.println();
		System.out.println("**************Thanks for playing.Have a nice day ***************");


	}

}
