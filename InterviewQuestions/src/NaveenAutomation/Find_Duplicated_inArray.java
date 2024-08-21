package NaveenAutomation;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicated_inArray {

	public static void main(String[] args) {

		// String names[] = { "suraj", "rohan", "amit", "abhijit", "suraj",
		// "rohan","vinod" ,"vinod","prashant","amit"};

		int numbers[] = { 1, 2, 3, 4, 5, 2, 3, 4 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == (numbers[j])) {
					System.out.println(numbers[i]);
				}
			}
		}

		System.out.println("-------------Hashset----------");

		Set<Integer> data = new HashSet<Integer>();

		for (int e : numbers) {
			if (data.add(e) == false) {
				System.out.println(e);
			}

		}
		
		
		
		

	}

}
