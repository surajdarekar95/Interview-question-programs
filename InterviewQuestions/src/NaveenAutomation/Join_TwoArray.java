package NaveenAutomation;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class Join_TwoArray {

	public static void main(String[] args) {

		String bowler[] = { "bumraj", "jaheer", "shardul", "shami", "siraj" };
		String batsman[] = { "virat", "shubhman", "rohit", "dhawan", "KL" };
		
		//Google Guava
		
		System.out.println("-----------String---------------");
		
		String team[] =ObjectArrays.concat(bowler, batsman,String.class);
		
		for(String Allteam: team) {
			System.out.println(Allteam);
		}
		
		System.out.println("-------------------Int--------------");
		int p1[]= {1,2,3,4,5,6};
		int p2[]= {7,8,9,10};
		
		int p3[]=Ints.concat(p1,p2);
		
		for(int p4:p3) {
			System.out.println(p4);
		}
		
		
		
		
		
		
		
	}

}
