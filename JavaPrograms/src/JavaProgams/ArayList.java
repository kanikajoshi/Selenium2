package JavaProgams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArayList {

	public static void main(String[] args) {
		LinkedList ob = new LinkedList();

		//Adding element to list

		ob.add('A');
		ob.add('B');
		ob.add('C');
		ob.add('D');
		ob.add('E');
		ob.add('F');
		ob.add('G');
		ob.add('H');
		ob.add('I');
		ob.add('J');
		ob.add('K');
		ob.add('L');
		
		
		//to print the elements of list
		System.out.println("=================================");
		System.out.println("The elements of the list are as followed");
		Iterator itr = ob.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

		/*for(Object a : ob)
		{
			System.out.println(a);
		}*/


		int size = ob.size();

		System.out.println("=================================");
		System.out.println("Middle element is=============="+size/2);

		
		
		Iterator i=ob.descendingIterator();
		System.out.println("=================================");

		System.out.println("Reverse of the list is =====================");
		while(i.hasNext()) {
			System.out.println(i.next());
		}


		System.out.println("=================================");

		for(Object ii: ob) {

			System.out.println("Index of "+ii+" is "+ob.indexOf(ii));
		}

		System.out.println("=================================");

		LinkedList ob2 = new LinkedList();
		
		for(int j=ob.size()-1;j>=0;j--) {
			ob2.add(ob.get(j));
		}
		
		System.out.println("Reverse of the list without iterator");
		for(Object o :ob2) {
			System.out.println(o);
		}

	}
}