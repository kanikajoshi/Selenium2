package RevisionDay1;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ob = new LinkedList();

		char [] characters= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		//Insert elements into linked list
		for(char i:characters) {
			i=Character.toUpperCase(i);
			ob.add(i);
		}

		//to print the list elements
		System.out.println("the list elements are as follows====================");
		System.out.println("----------------------------------------------------");

		Iterator itr = ob.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*****************************************************");


		//to reverse the list
		System.out.println("the reverse list elements are as follows==============");
		System.out.println("-------------------------------------------------------");
		LinkedList ob2 = new LinkedList();
		for(int j =ob.size()-1;j>=0;j-- ) {

			ob2.add(ob.get(j));
		}
		
		Iterator itr2 = ob2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*****************************************************");


	}

}
