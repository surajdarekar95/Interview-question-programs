package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_demo2 {

	public static void main(String[] args) {

		ArrayList org_al = new ArrayList();
		org_al.add("suraj");
		org_al.add("Rohan");
		org_al.add("Amit");
		org_al.add("Abbhi");
		org_al.add("vinod");
		System.out.println(org_al);
		
		ArrayList duplicate_al = new ArrayList();
		
		duplicate_al.addAll(org_al);
		System.out.println(duplicate_al);
		duplicate_al.removeAll(org_al);
		System.out.println("After Removing all "+duplicate_al);
		
		System.out.println("Elements in arraylist before sorting "+org_al);
		Collections.sort(org_al);
		
		System.out.println("Elements in arraylist after sorting "+org_al);
		System.out.println("Elements in arraylist before reverse "+org_al);
		
		Collections.reverse(org_al);
		
		System.out.println("Elements in arraylist after reverse "+org_al);
		
		Collections.shuffle(org_al);

		System.out.println("Elements in arraylist after shuffeling "+org_al);


		



	}

}
