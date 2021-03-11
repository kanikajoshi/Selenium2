package JavaProgams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate2 {

	public static void main(String[] args) {
		
		//Finding duplicates in array 
		
		int In [] = {100,20,40,120,30,2,3};
		
		TreeSet ob = new TreeSet();
		for(int i : In) {
			if(ob.add(i)==false) {
				System.out.println("duplicate is "+i);
				System.out.println("****************************************");
			}
		
		}
		
		
	
		
		System.out.println("****************************************");
		int s = ob.size()-2;
		for(Object U : ob) {System.out.println(U);}
		
		LinkedList ob2 = new LinkedList();
		for(Object T : ob) {
			ob2.add(T);
			}
		System.out.println("The Second largest number is at "+ob2.get(s));
}
}