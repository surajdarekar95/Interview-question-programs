package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_demo {

	public static void main(String[] args) {

		// Declaration for heterogeneous data

		ArrayList al = new ArrayList();

		al.add("Suraj");
		al.add('D');
		al.add(true);
		al.add(123);
		al.add(15.5);
		
		System.out.println(al);
		System.out.println("Number of elements: "+al.size());
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al);
		al.add(2, "Java");
		System.out.println(al);	
		System.out.println(al.get(2));
		al.set(3, 20.20);
		System.out.println(al);	
		System.out.println(al.contains('D'));
		System.out.println(al.isEmpty());	

		// Reading data from arraylist
		//1.using fot loop
		
		System.out.println("Reading elements by using for loop");

		for(int i=0;i<al.size();i++) {
			System.out.print(" "+al.get(i));
		}
		System.out.println();
		
		System.out.println("Reading elements by using for each loop");
		
		for(Object elements:al) {
			System.out.print(" "+elements);
		}
		System.out.println();
		
		
		System.out.println("Reading elements by using iterator");

		Iterator IT = al.iterator();
		
		while(IT.hasNext()) {
			System.out.print(" "+IT.next());
		}


		// Declaration for homogeneous data - we can store only string

		ArrayList<String> al1 = new ArrayList<String>();

		// Declaration for homogeneous data - we can store only Integer

		ArrayList<Integer> al2 = new ArrayList<Integer>();

	}

}
