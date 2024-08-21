package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CovertArray_ToArrayList {

	public static void main(String[] args) {

		String [] animals= {"dog","cat","horse","tiger"};
		
		for(String an:animals) {
			System.out.print(" "+an);
		}
		System.out.println();
		ArrayList animal = new ArrayList(Arrays.asList(animals));
		System.out.println(animal);
	}

}
